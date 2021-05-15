package model;


import model.cards.Card;

import java.util.ArrayList;
import java.util.Collections;


public class Deck implements Prototype{
    private SideDeck sideDeck;
    private String name;
    public boolean isValid;
    private MainDeck mainDeck;


    public Deck(String name) {
        setName(name);
        sideDeck = new SideDeck();
        mainDeck = new MainDeck();
    }

    @Override
    public Object clone() {
        Deck deck = new Deck(this.getName());
        deck.mainDeck = (MainDeck) this.mainDeck.clone();
        deck.sideDeck = (SideDeck) this.sideDeck.clone();
        deck.isValid = this.isValid ;
        return deck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public MainDeck getMainDeck() {
        return mainDeck;
    }

    public SideDeck getSideDeck() {
        return sideDeck;
    }

    public String getValidity() {
        return isValid ? "valid" : "invalid";
    }

    public void deleteDeck() {

    }

    public boolean doesDeckHaveThreeOfThisCard(String cardName) {
        int counter = 0;
        for (Card card : this.mainDeck.allCards) {
            if (card.getName().matches(cardName)) counter++;
        }
        for (Card card : this.sideDeck.allCards) {
            if (card.getName().matches(cardName)) counter++;
        }
        if (counter == 3) return true;
        else return false;
    }

    public void addCardToDeck(String cardName, String deckType) {
        if (deckType.equals("side")) {
            sideDeck.addCardToDeck(cardName);
        } else
            sideDeck.addCardToDeck(cardName);
    }

    public void removeCardFromDeck(String cardName, String deckType) {
        if (deckType.equals("side")) {
            sideDeck.removeCardFromDeck(cardName);
        } else
            sideDeck.removeCardFromDeck(cardName);
    }

//    public static Deck getRandomDeck() {
//
//    }

    public void shuffleDeck() {
        Collections.shuffle(this.mainDeck.allCards);
        Collections.shuffle(this.sideDeck.allCards);
    }



    @Override
    public String toString() {
        return "Deck:\n" +
                "Side/Main deck:\n" +
                "Monsters:\n" +
                //todo mosters +
                "Spell and Trap:\n"
                //todo spell and trap +
                ;
    }

}

