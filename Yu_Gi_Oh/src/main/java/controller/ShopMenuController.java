package controller;

import model.User;
import model.cards.Card;
import model.cards.CardFactory;

import java.util.Comparator;
import java.util.regex.Matcher;

public class ShopMenuController extends Controller {
    User user = User.currentUser;

    public void processCommand(String command) {
        if (command.matches("shop buy \\S+")) buyCard(command);
        else if (command.matches("shop show --all")) showAllCards();
        else print("invalid command");

    }

    private void buyCard(String command) {
        Matcher cardNameMatcher = getMatcher("shop buy (\\S+)", command);
        if (cardNameMatcher.find()) {
            String cardName = cardNameMatcher.group(1);
            if (CardFactory.getCardByCardName(cardName) == null)
                print("there is no card with this name");
            else {
                Card card = CardFactory.getCardByCardName(cardName);
                if (user.getCoins() < card.getPrice()) print("not enough money");
                else user.addCard(card);
            }
        }
    }

    private void showAllCards() {
        Comparator<Card> cardComparator = Comparator.comparing(Card::getName);
        CardFactory.getAllCards().sort(cardComparator);
        for (Card card : CardFactory.getAllCards()) {
            print(card.getName() + ":" + card.getDescription());
        }
    }
}
