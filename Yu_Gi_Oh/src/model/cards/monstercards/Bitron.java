package model.cards.monstercards;

public class Bitron extends MonsterCard{
    public Bitron(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
