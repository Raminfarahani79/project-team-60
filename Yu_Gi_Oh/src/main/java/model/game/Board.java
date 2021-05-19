package model.game;

import controller.DuelMenuController;
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
    private ArrayList<Card> hand;
    private Deck deck;

    public Board(Deck deck) {
        graveyard = new ArrayList<>();
        monsterZone = new MonsterCard[5];
        spellAndTrapZone = new Card[5];
        hand = new ArrayList<>();
        setDeck(deck);
        for (int i = 1; i < 6; i++) {
            addCardFromDeckToHand();
        }
        for (Card card : deck.getMainDeck().getAllCards()) {
            card.setLocation(Location.DECK);
        }
        for (Card card : deck.getSideDeck().getAllCards()) {
            card.setLocation(Location.DECK);
        }
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }


    public void putCardInFieldZone(Card card) {
        card.setLocation(Location.FIELD_ZONE);
        fieldZone = (SpellCard) card;
    }

    public void putCardInGraveyard(Card card) {
        card.setLocation(Location.GRAVEYARD);
        graveyard.add(card);
    }

    public void putCardInMonsterZone(Card card) {
        card.setLocation(Location.MONSTER_ZONE);
        for (MonsterCard cardInZone : monsterZone) {
            if (cardInZone == null)
                cardInZone = (MonsterCard) card;
        }
    }

    public void putCardInSpellAndTrapZone(Card card) {
        card.setLocation(Location.SPELL_TRAP_ZONE);
        for (Card cardINZone : spellAndTrapZone) {
            if (cardINZone == null)
                cardINZone = card;
        }
    }

    public void putCardInHand(Card card) {
        card.setLocation(Location.HAND);
    }

    public ArrayList<Card> getGraveyard() {
        return graveyard;
    }

    public Card putFieldZone() {
        return fieldZone;
    }

    public Card[] putSpellAndTrapZone() {
        return spellAndTrapZone;
    }

    public MonsterCard[] getMonsterZone() {
        return monsterZone;
    }


    public ArrayList<Card> getHand() {
        return hand;
    }


    public void removeCardFromGraveyard(Card card) {
        card.setLocation(null);
        graveyard.remove(card);
    }

    public void removeCardFromMonsterZone(Card card) {
        card.setLocation(null);

    }

    public void removeCardFromHand(Card card) {
        card.setLocation(null);
        for (int i = 0; i < 5; i++) {
            if (monsterZone[i] == card) {
                monsterZone[i] = null;
                break;
            }
        }
    }

    public void removeCardFromFieldZone(Card card) {
        card.setLocation(null);
        fieldZone = null;
    }

    public void removeCardFromSpellTrapZone(Card card) {
        card.setLocation(null);
        for (int i = 0; i < 5; i++) {
            if (spellAndTrapZone[i] == card) {
                spellAndTrapZone[i] = null;
                break;
            }
        }
    }

    public void removeCardFromMainDeck(Card card) {
        card.setLocation(null);
       deck.getMainDeck().getAllCards().remove(card);
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
            return hand.get(handNumber);
        } else if (location.matches("field"))
            return fieldZone;
        return null;
    }

    public void addCardFromDeckToHand() {
        if (deck.getMainDeck().getAllCards().size() > 0) {
            Card card = deck.getMainDeck().getAllCards().get((deck.getMainDeck().getAllCards().size() - 1));
            removeCardFromMainDeck(card);
            putCardInHand(card);
        } else
            Game.getCurrentGame().endGame(Game.getCurrentGame().getOpponentPlayer());
    }

    public String toString() {
        StringBuilder returnString = new StringBuilder();
        if (fieldZone == null) returnString.append("E\t\t\t\t\t\t");
        else returnString.append("O\t\t\t\t\t\t");
        returnString.append(graveyard.size() + "\n\t");
        int[] counter = {5, 3, 1, 2, 4};
        for (int i : counter) {
            if (monsterZone[i] == null) returnString.append("E \t");
            else {
                switch (monsterZone[i].getPosition()) {
                    case ATTACK:
                        returnString.append("OO\t");
                    case DEFENCE:
                        if (monsterZone[i].isHidden()) returnString.append("DH");
                        else returnString.append("DO");
                }
            }
            returnString.append("\n");
        }
        for (int i : counter) {
            if (spellAndTrapZone[i] == null) returnString.append("E \t");
            else if (spellAndTrapZone[i].isHidden()) returnString.append("H \t");
            else returnString.append("O\t");
        }
        returnString.append("\n");
        for (int i = 1; i <= hand.size(); i++) {
            returnString.append("c\t");
        }
        return returnString.toString();
    }


    public void putCardInGraveyard(ArrayList<MonsterCard> monsterCards) {
        for (int i = 0; i < monsterCards.size(); i++)
            putCardInGraveyard(monsterCards.get(i));
    }
}
