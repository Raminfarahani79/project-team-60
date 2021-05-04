package view.menus;

import model.User;
import model.cards.Card;

import java.util.Comparator;
import java.util.regex.Matcher;

public class ShopMenu extends Menu {
    User user = User.currentUser;
    public ShopMenu(Menu parentMenu) {
        super("Shop", parentMenu);
    }

    @Override
    public void run() {
        runMenuCommands();
        if (input.matches("shop buy \\S+")) buyCard(getMatcher("shop buy (\\S+)", input));
        else if (input.matches("￼shop show --all")) showAllCards();
        else print("invalid command");
    }

    private void buyCard(Matcher matcher) {
        if (Card.getCardByCardName(matcher.group(1)) == null) print("there is no card with this name");
        else {
            Card card = Card.getCardByCardName(matcher.group(1));
            if (user.getCoins() < card.getPrice()) print("not enough money");
            else user.addCard(card.getName());
        }
    }

    private void showAllCards() {
        Comparator<Card>  cardComparator = Comparator.comparing(Card::getName);
        Card.getAllCards().sort(cardComparator);
        for (Card card : Card.getAllCards()) {
            print(card.getName() + ":" + card.getDescription());
        }
    }
}
