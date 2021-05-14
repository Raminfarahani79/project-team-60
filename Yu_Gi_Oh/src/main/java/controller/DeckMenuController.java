package controller;

import model.Deck;
import model.User;
import view.menus.Menu;

import java.util.regex.Matcher;

public class DeckMenuController extends Controller {
    public void processCommand(String command) {
        if (command.matches("deck create \\S+")) createDeck(command.split("\\s"));
        else if (command.matches("deck delete \\S+")) deleteDeck(command.split("\\s"));
        else if (command.matches("deck set-activate \\S+")) setDeckActive(command.split("\\s"));
        else if (command.matches("deck add-card (?=.*(--card \\S+))(?=.*(--deck \\S+))" +
                "((\\1 \\2( --side)?)|(\\2 \\1( --side)?)|(\\1 --side \\2)|(\\2 --side \\1)|((--side )?\\1 \\2)|((--side )?\\2 \\1))"))
            addCardToDeck(command);
        else if (command.matches("deck rm-card (?=.*(--card \\S+))(?=.*(--deck \\S+))" +
                "((\\1 \\2( --side)?)|(\\2 \\1( --side)?)|(\\1 --side \\2)|(\\2 --side \\1)|((--side )?\\1 \\2)|((--side )?\\2 \\1))"))
            removeCardFromDeck(command);
        else if (command.matches("deck show --all")) showAllDecks();
        else if (command.matches("deck show (?=.*(--deck-name \\S+))((\\1( --side)?)|(--side )?\\1)"))
            showDeck(command);
        else if (command.matches("cards show \\S+")) showCard(command);
        else if (command.matches("deck show --cards")) showPurchasedCards();
        else print("invalid command");
    }

    private void showCard(String command) {
        String[] commandSplit = command.split(" ");
        //todo show card should be handled by card class
    }

    private void createDeck(String[] commandSplit) {
        if (User.currentUser.getUserDecks().isDeckNameUsedBefore(commandSplit[2]))
            print("deck with name " + commandSplit[2] + " already exists");
        else {
            new Deck(commandSplit[2]);
            User.currentUser.getUserDecks().createDeck(commandSplit[2]);
            print("deck created successfully!");
        }
    }

    private void deleteDeck(String[] commandSplit) {
        if (!User.currentUser.getUserDecks().isDeckNameUsedBefore(commandSplit[2]))
            print("deck with name " + commandSplit[2] + " does not exists");
        else {
            User.currentUser.getUserDecks().deleteDeck(commandSplit[2]);
            print("deck deleted successfully!");
        }
    }

    private void setDeckActive(String[] commandSplit) {
        if (!User.currentUser.getUserDecks().isDeckNameUsedBefore(commandSplit[2]))
            print("deck with name " + commandSplit[2] + " does not exists");
        else {
            User.currentUser.getUserDecks().setActiveDeck(commandSplit[2]);
            print("deck activated successfully!");
        }
    }

    private void addCardToDeck(String command) {
        Matcher cardNameMatcher = getMatcher("--card (\\S+)", command);
        Matcher deckNameMatcher = getMatcher("--deck (\\S+)", command);
        deckNameMatcher.find();
        cardNameMatcher.find();
        String cardName = cardNameMatcher.group(1);
        String deckName = deckNameMatcher.group(1);
        String deckType = command.contains("--side") ? "side" : "main";
        if (!User.currentUser.doesUserHaveThisCard(cardName))
            print("card with name " + cardName + " does not exist");
        else if (!User.currentUser.getUserDecks().isDeckNameUsedBefore(deckName))
            print("deck with name " + cardName + " does not exist");
        else if (!deckType.equals("side") && User.currentUser.getUserDecks().getDeckByName(deckName).getMainDeck().isDeckFull())
            print("main deck if full");
        else if (deckType.equals("side") && User.currentUser.getUserDecks().getDeckByName(deckName).getSideDeck().isDeckFull())
            print("side deck is full");
        else if (User.currentUser.getUserDecks().getDeckByName(deckName).doesDeckHaveThreeOfThisCard(cardName))
            print("there are already three cards with name " + cardName + " in deck " + deckName);
        else {
            User.currentUser.getUserDecks().getDeckByName(deckName).addCardToDeck(cardName, deckType);
            User.currentUser.removeCard(cardName);
            print("card added to deck successfully");
        }
    }

    private void removeCardFromDeck(String command) {
        Matcher cardNameMatcher = getMatcher("--card (\\S+)", command);
        Matcher deckNameMatcher = getMatcher("--deck (\\S+)", command);
        deckNameMatcher.find();
        cardNameMatcher.find();
        String cardName = cardNameMatcher.group(1);
        String deckName = deckNameMatcher.group(1);
        String deckType = command.contains("--side") ? "side" : "main";
        if (!User.currentUser.getUserDecks().isDeckNameUsedBefore(deckName))
            print("deck with name " + cardName + " does not exist");
        else if (deckName.equals("side") && User.currentUser.getUserDecks().getDeckByName(deckName).getSideDeck().doesDeckHaveThisCard(cardName))
            print("card with name " + cardName + " does not exist in " + deckType + " deck");
        else if (deckName.equals("main") && User.currentUser.getUserDecks().getDeckByName(deckName).getMainDeck().doesDeckHaveThisCard(cardName))
            Menu.print("card with name " + cardName + " does not exist in " + deckType + " deck");
        else {
            User.currentUser.getUserDecks().getDeckByName(deckName).removeCardFromDeck(cardName, deckType);
            User.currentUser.addCard(cardName);
            print("card removed form deck successfully");
        }
    }

    private void showAllDecks() {
        StringBuilder allDecksString = new StringBuilder();
        print(User.currentUser.getUserDecks().showAllDecks());
    }

    private void showDeck(String command) {
        String regex = "deck show (?=.*(--deck-name \\S+))((\\1( --side)?)|(--side )?\\1)";
        Matcher matcher = getMatcher(regex, command);
        String[] deckNameGroup = matcher.group(2).split(" ");
        if (!User.currentUser.getUserDecks().isDeckNameUsedBefore(deckNameGroup[1]))
            Menu.print("deck with name " + deckNameGroup[1] + " does not exist");
        else Menu.print(User.currentUser.getUserDecks().getDeckByName(deckNameGroup[1]).toString());
    }

    private void showPurchasedCards() {
        //show all purchased cards

    }
}
