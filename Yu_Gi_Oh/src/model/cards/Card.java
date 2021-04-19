package model.cards;

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
}
