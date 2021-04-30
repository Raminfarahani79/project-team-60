package model.cards.monstercards;

public class YomiShip extends MonsterCard{
    public YomiShip(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.NORMAL;
        this.monsterType = MonsterType.AQUA;
    }

    public void action(MonsterCard monster){

    }
}