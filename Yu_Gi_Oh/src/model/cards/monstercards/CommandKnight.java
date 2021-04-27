package model.cards.monstercards;

public class CommandKnight extends MonsterCard {
    public CommandKnight(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.FIRE;
        this.cardType = CardType.EFFECT;
    }

    public void action(MonsterCard monster){

    }
}
