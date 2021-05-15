package model.game;

import model.Deck;
import model.cards.Card;

public class Game {
    private static Game currentGame;
    private Phases phase = Phases.DRAW;
    private int round;
    private Card selectedCard ;
    private Player opponentPlayer;
    private Player currentPlayer;
    private Player userPlayer;

    public Game(String userPlayerUsername, String opponentPlayerUsername, int round, Deck userPlayerDeck, Deck opponentPlayerDeck){
        opponentPlayer = new Player(opponentPlayerUsername,(Deck)opponentPlayerDeck.clone());
        userPlayer = new Player(userPlayerUsername,(Deck)userPlayerDeck.clone());
        setRound(round);
        currentGame = this;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setOpponentPlayer(Player opponentPlayer) {
        this.opponentPlayer = opponentPlayer;
    }

    public void setUserPlayer(Player userPlayer) {
        this.userPlayer = userPlayer;
    }

    public void setSelectedCard(Card selectedCard) {
        this.selectedCard = selectedCard;
    }

    public Card getSelectedCard() {
        return selectedCard;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getOpponentPlayer() {
        return opponentPlayer;
    }

    public Player getUserPlayer() {
        return userPlayer;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public Phases getPhase() {
        return phase;
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public void nextPhase(){
        phase = phase.next();
    }

}
