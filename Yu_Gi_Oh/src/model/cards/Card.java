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
}
