package model.cards;

import model.cards.monstercards.MonsterCard;

public abstract class Card {
    private String name;
    private String description;
    private boolean isHidden;
    private Location location;
    private Board board;

    public Card(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Card(String name, String description, boolean isHidden, Location location) {
        this.name = name;
        this.description = description;
        this.isHidden = isHidden;
        this.location = location;
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
