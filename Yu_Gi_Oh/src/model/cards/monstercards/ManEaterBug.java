package model.cards.monstercards;

public class ManEaterBug extends MonsterCard{
    public ManEaterBug(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.type = Type.EFFECT;
    }

    public void action(MonsterCard monster){

    }
}
