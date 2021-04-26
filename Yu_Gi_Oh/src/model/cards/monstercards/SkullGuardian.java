package model.cards.monstercards;

public class SkullGuardian extends MonsterCard{
    public SkullGuardian(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.LIGHT;
        this.type = Type.RITUAL;
    }

    public void action(MonsterCard monster){

    }
}
