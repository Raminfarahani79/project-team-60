package model.cards.monstercards;

public class Wattkid extends MonsterCard{
    public Wattkid(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.LIGHT;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
