package model;

import model.cards.Card;

import java.util.ArrayList;

public class SideDeck implements Prototype {
    protected ArrayList<Card> allCards;
    public boolean isFull;
    private String name;

    public SideDeck (String name) {
        allCards = new ArrayList<>();
        this.name = name;
    }

    public void addCardToDeck(String cardName) {
        ArrayList<Card> userCardsNotInDeck =User.currentUser.getUserDecks().getDeckByName(name).userCardsNotInDeck;
        for (Card card : userCardsNotInDeck) {
            if (card.getName().equalsIgnoreCase(cardName)){
                allCards.add(card);
                userCardsNotInDeck.remove(card);
            }
        }
    }

    public void removeCardFromDeck(String cardName) {
        ArrayList<Card> userCardsNotInDeck =User.currentUser.getUserDecks().getDeckByName(name).userCardsNotInDeck;
        for (Card card : allCards) {
            if (card.getName().equalsIgnoreCase(cardName)){
                userCardsNotInDeck.add(card);
                allCards.remove(card);
            }
        }
    }

    @Override
    public Object clone() {
        SideDeck sideDeck = new SideDeck(name);
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
