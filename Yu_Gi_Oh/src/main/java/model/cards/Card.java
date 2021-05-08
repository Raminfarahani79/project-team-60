package model.cards;

import java.util.*;

import model.cards.monstercards.MonsterCard;


public abstract class Card {
    private String name;
    private String description;
    private int price;
    private boolean isHidden;
    private Location location;
    protected static ArrayList<Card> allCards;
    private String type;
    // TODO: 5/3/21 adding cards to allCards arraylist

    public Card(String name, String description,int price) {
        setName(name);
        setDescription(description);
        setPrice(price);
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

    public static ArrayList<Card> getAllCards() {
        return allCards;
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


    public int getPrice() {
        return price;
    }

    public boolean isHidden() {
        return isHidden;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
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

}
