package model;

import model.cards.Card;

import java.util.ArrayList;

public class SideDeck implements Prototype {
    protected ArrayList<Card> allCards;
    public boolean isFull;

    public SideDeck () {
        allCards = new ArrayList<>();
    }

    public void addCardToDeck(String cardName) {

    }

    public void removeCardFromDeck(String cardName) {

    }

    @Override
    public Object clone() {
        SideDeck sideDeck = new SideDeck();
        sideDeck.allCards = (ArrayList) this.allCards.clone();
        sideDeck.isFull = this.isFull;
        return sideDeck;
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
