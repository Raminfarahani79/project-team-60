package controller;

import model.Deck;
import model.User;
import view.menus.Menu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeckMenuController {
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
        else Menu.print("invalid command");
    }

    private void showCard(String command) {
        String[] commandSplit = command.split(" ");
        //todo show card should be handled by card class
    }

    private void createDeck(String[] commandSplit) {
        if (User.currentUser.isDeckNameUsedBefore(commandSplit[2]))
            Menu.print("deck with name " + commandSplit[2] + " already exists");
        else {
            new Deck(commandSplit[2]);
            User.currentUser.createDeck(commandSplit[2]);
            Menu.print("deck created successfully!");
        }
    }

    private void deleteDeck(String[] commandSplit) {
        if (!User.currentUser.isDeckNameUsedBefore(commandSplit[2]))
            Menu.print("deck with name " + commandSplit[2] + " does not exists");
        else {
            User.currentUser.deleteDeck(commandSplit[2]);
            Menu.print("deck deleted successfully!");
        }
    }

    private void setDeckActive(String[] commandSplit) {
        if (!User.currentUser.isDeckNameUsedBefore(commandSplit[2]))
            Menu.print("deck with name " + commandSplit[2] + " does not exists");
        else {
            User.currentUser.setActiveDeck(commandSplit[2]);
            Menu.print("deck activated successfully!");
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
            Menu.print("card with name " + cardName + " does not exist");
        else if (!User.currentUser.isDeckNameUsedBefore(deckName))
            Menu.print("deck with name " + cardName + " does not exist");
        else if (!deckType.equals("side") && User.currentUser.getDeckByName(deckName).getMainDeck().isDeckFull())
            Menu.print("main deck if full");
        else if (deckType.equals("side") && User.currentUser.getDeckByName(deckName).getSideDeck().isDeckFull())
            Menu.print("side deck is full");
        else if (User.currentUser.getDeckByName(deckName).doesDeckHaveThreeOfThisCard(cardName))
            Menu.print("there are already three cards with name " + cardName + " in deck " + deckName);
        else {
            User.currentUser.getDeckByName(deckName).addCardToDeck(cardName, deckType);
            User.currentUser.removeCard(cardName);
            Menu.print("card added to deck successfully");
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
        if (!User.currentUser.isDeckNameUsedBefore(deckName))
            Menu.print("deck with name " + cardName + " does not exist");
        else if (deckName.equals("side") && User.currentUser.getDeckByName(deckName).getSideDeck().doesDeckHaveThisCard(cardName))
            Menu.print("card with name " + cardName + " does not exist in " + deckType + " deck");
        else if (deckName.equals("main") && User.currentUser.getDeckByName(deckName).getMainDeck().doesDeckHaveThisCard(cardName))
            Menu.print("card with name " + cardName + " does not exist in " + deckType + " deck");
        else {
            User.currentUser.getDeckByName(deckName).removeCardFromDeck(cardName,deckType);
            User.currentUser.addCard (cardName);
            Menu.print("card removed form deck successfully");
        }
    }

    private void showAllDecks() {
        //todo

    }

    private void showDeck(String command) {
        String regex = "deck show (?=.*(--deck-name \\S+))((\\1( --side)?)|(--side )?\\1)";
        Matcher matcher = getMatcher(regex, command);
        String[] deckNameGroup = matcher.group(2).split(" ");
        if (!User.currentUser.isDeckNameUsedBefore(deckNameGroup[1]))
            Menu.print("deck with name " + deckNameGroup[1] + " does not exist");
        else Menu.print(User.currentUser.getDeckByName(deckNameGroup[1]).toString());
    }

    private void showPurchasedCards() {
        //show all purchased cards

    }

    private Matcher getMatcher(String regex, String command) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(command);
    }

}