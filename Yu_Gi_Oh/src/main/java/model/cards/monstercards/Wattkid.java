package model.cards.monstercards;

public class Wattkid extends MonsterCard{
    public Wattkid(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.LIGHT;
        this.cardType = CardType.NORMAL;
        this.monsterType = MonsterType.THUNDER;
    }

    public void action(MonsterCard monster){

    }
}
