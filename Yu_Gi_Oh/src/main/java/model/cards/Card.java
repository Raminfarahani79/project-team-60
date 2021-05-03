package model.cards;

import model.cards.monstercards.MonsterCard;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Card {
    private String name;
    private String description;
    private boolean isHidden;
    private Location location;
    private Board board;
    protected static ArrayList<Card> allCards;
    // TODO: 5/3/21 adding cards to allCards arraylist 

    public Card(String name, String description) {
        setName(name);
        setDescription(description);
    }

    public Card(String name, String description, boolean isHidden, Location location) {
        setName(name);
        setDescription(description);
        setHidden(isHidden);
        setLocation(location);
    }

    public static Card getCardByCardName(String cardName) {
        for (Card card : allCards) {
            if (card.name.equals(cardName)) return card;
        }
        return null;
    }

    public void action(MonsterCard monster) {

    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Location getLocation() {
        return location;
    }

    public Board getBoard() {
        return board;
    }


    public boolean isHidden() {
        return isHidden;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHidden(boolean hidden) {
        isHidden = hidden;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}
