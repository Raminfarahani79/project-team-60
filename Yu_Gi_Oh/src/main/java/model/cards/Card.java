package model.cards;

import model.cards.monstercards.MonsterCard;

public abstract class Card {
    protected String name;
    protected String description;
    protected boolean isHidden;
    protected Location location;
    protected Board board;

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

    public void action(MonsterCard monster){

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
