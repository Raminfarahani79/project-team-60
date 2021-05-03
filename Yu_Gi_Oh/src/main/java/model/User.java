package model;

import model.cards.Card;

import java.util.ArrayList;

public class User {
    private static ArrayList<User> allUsers;
    private String username;
    private String password;
    private String nickname;
    private int score;
    private int coins;
    private Deck activeDeck;
    private ArrayList<Card> userCards;
    private Board board;
    public ArrayList<Deck> userDecks;

    static {
        allUsers = new ArrayList<>();
    }

    public User(String username, String password, String nickname) {
        setUsername(username);
        setPassword(password);
        setNickname(nickname);
    }

    public static User getUserByUsername(String username) {
        for (User user : allUsers) {
            if (user.getUsername().equals(username)) return user;
        }
        return null;
    }

    public static boolean doesUsernameExist(String username) {
        return allUsers.contains(getUserByUsername(username));
    }

    public static boolean doesNicknameExist(String nickname) {
        for (User user : allUsers) {
            if (user.getNickname().equals(nickname)) return true;
        }
        return false;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public String getUsername() {
        return username;
    }

    public String getNickname() {
        return nickname;
    }

    public int getScore() {
        return score;
    }

    public Board getBoard() {
        return board;
    }

    public ArrayList<Deck> getUserDecks() {
        return userDecks;
    }

    public void addDeck(Deck deck) {
        userDecks.add(deck);
    }
}
