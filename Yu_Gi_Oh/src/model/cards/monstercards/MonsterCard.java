package model.cards.monstercards;
import model.cards.Card;
import model.cards.Position;

public class MonsterCard extends Card {
    private int level;
    private int defencePoint;
    private int attackPoint;
    private boolean switchedPosition;
    private Position position = Position.DEFENCE;

    public MonsterCard(String name, String description, String level, int attackPoint, int defencePoint){
        super(name, description);

    }
}
