package model.cards.monstercards;

public class FeralImp extends MonsterCard{
    public FeralImp(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.DARK;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
