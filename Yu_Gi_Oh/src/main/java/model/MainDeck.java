package model;

import model.cards.Card;

import java.util.ArrayList;

public class MainDeck  {
    protected ArrayList<Card> allCards;
    public boolean isFull;

    public MainDeck () {
        allCards = new ArrayList<>();
    }

    public void addCardToDeck(String cardName) {

    }

    public void removeCardFromDeck(String cardName) {

    }

    public Boolean doesDeckHaveThisCard(String cardName) {
        if (allCards.size() > 0) {
            for (Card card : allCards) {
                if (card.getName().equals(cardName)) return true ;
            }
            return false;
        }
        return false;
    }

    public boolean isDeckFull() {
        return isFull;
    }
}
