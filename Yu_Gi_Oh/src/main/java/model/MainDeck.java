package model;

import model.cards.Card;

import java.util.ArrayList;

public class MainDeck  implements Prototype{
    protected ArrayList<Card> allCards;
    public boolean isFull;

    public MainDeck () {
        allCards = new ArrayList<>();
    }

    public ArrayList<Card> getAllCards() {
        return allCards;
    }

    public void addCardToDeck(String cardName) {

    }

    public void removeCardFromDeck(String cardName) {
        for (Card card : allCards) {
            if (card.getName().equalsIgnoreCase(cardName)) {
                allCards.remove(card);
            }
        }
    }

    @Override
    public Object clone() {
        MainDeck mainDeck = new MainDeck();
         mainDeck.allCards = (ArrayList) this.allCards.clone();
         mainDeck.isFull = this.isFull;
         return mainDeck;
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
