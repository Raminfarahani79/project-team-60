package model.cards.monstercards;

public class SpiralSerpent extends MonsterCard{
    public SpiralSerpent(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.WATER;
        this.cardType = CardType.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
