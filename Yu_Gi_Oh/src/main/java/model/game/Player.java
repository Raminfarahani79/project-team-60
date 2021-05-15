package model.game;

import model.Deck;

public class Player {
    private String username;
    private Board board;
    private Deck deck;
    private int lifePoint = 8000;

    public Player (String name, Deck deck){
        setDeck(deck);
        setUsername(username);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public Board getBoard() {
        return board;
    }


}
