package model.cards.monstercards;

public class CrawlingDragon extends MonsterCard{
    public CrawlingDragon(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
