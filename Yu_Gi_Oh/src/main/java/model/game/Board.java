package model.game;

import model.Deck;
import model.cards.Card;
import model.cards.Location;
import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.SpellCard;

import java.util.ArrayList;

public class Board {
    private ArrayList<Card> graveyard;
    private MonsterCard[] monsterZone;
    private Card[] spellAndTrapZone;
    private SpellCard fieldZone;
    private Card[] hand;
    private Deck deck;

    public Board(Deck deck) {
        graveyard = new ArrayList<>();
        monsterZone = new MonsterCard[5];
        spellAndTrapZone = new Card[5];
        hand = new Card[6];

        setDeck(deck);
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }


    public void setFieldZone(Card fieldZone) {
        fieldZone = (SpellCard) fieldZone;
    }

    public void setGraveyard(ArrayList<Card> graveyard) {
        graveyard = graveyard;
    }

    public void setMonsterZone(MonsterCard[] monsterZone) {
        this.monsterZone = monsterZone;
    }

    public void setSpellAndTrapZone(Card[] spellAndTrapZone) {
        spellAndTrapZone = spellAndTrapZone;
    }

    public ArrayList<Card> getGraveyard() {
        return graveyard;
    }

    public Card getFieldZone() {
        return fieldZone;
    }

    public Card[] getSpellAndTrapZone() {
        return spellAndTrapZone;
    }

    public MonsterCard[] getMonsterZone() {
        return monsterZone;
    }


    public Card[] getHand() {
        return hand;
    }


    public void removeCardToGraveyard(Card card) {

    }

    public Card getCardInLocation(String location) {
        if (location.matches("--monster \\d")) {
            int monsterNumber = Integer.parseInt(location.replace("--monster ", ""));
            return monsterZone[monsterNumber];
        } else if (location.matches("--spell \\d")) {
            int spellNumber = Integer.parseInt(location.replace("--spell ", ""));
            return spellAndTrapZone[spellNumber];
        } else if (location.matches("--hand \\d")) {
            int handNumber = Integer.parseInt(location.replace("--spell ", ""));
            return hand[handNumber];
        } else if (location.matches("field"))
            return fieldZone;
        return null;
    }

    public String toString() {
        StringBuilder returnString = new StringBuilder();
        if (fieldZone == null)
            returnString.append("E\t\t\t\t\t\t");
        else
            returnString.append("O\t\t\t\t\t\t");
        returnString.append(graveyard.size() + "\n\t");
        for (int i = 0; i < 6; i++) {
            if (monsterZone[i] == null)
                returnString.append("E\t");
            else {
                switch (monsterZone[i].getPosition()) {
                    case ATTACK:
                        returnString.append("OO\t");
                    case DEFENCE:
                        if (monsterZone[i].isHidden()) returnString.append("DH");
                        else returnString.append("DO");
                }
            }
        }
        returnString.append("\n");
        for (int i = 1 ; i <= hand.length ; i++) {
            returnString.append("c\t");
        }
        return returnString.toString();
    }
}
