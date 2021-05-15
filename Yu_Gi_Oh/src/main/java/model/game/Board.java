package model.game;

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

    public void removeCardToGraveyard (Card card) {

    }

    public Card getCardInLocation(String location) {
        switch (Location.getLocationByString(location)) {
            case MONSTER1: return monsterZone[0];
            case MONSTER2: return monsterZone[1];
            case MONSTER3: return monsterZone[2];
            case MONSTER4: return monsterZone[3];
            case MONSTER5: return monsterZone[4];
            case SPELL1: return spellAndTrapZone[0];
            case SPELL2: return spellAndTrapZone[1];
            case SPELL3: return spellAndTrapZone[2];
            case SPELL4: return spellAndTrapZone[3];
            case SPELL5: return spellAndTrapZone[4];
            case FIELD: return fieldZone;
        }
        return null;
    }



//    public String show() {
//
//    }
}
