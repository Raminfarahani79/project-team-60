package model.cards.monstercards;

public class CrabTurtle extends MonsterCard{
    public CrabTurtle(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.WATER;
        this.cardType = CardType.RITUAL;
        this.monsterType = MonsterType.AQUA;
    }

    public void action(MonsterCard monster){

    }
}
