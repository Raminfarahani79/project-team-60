package model.cards.monstercards;

public class BabyDragon extends MonsterCard{
    public BabyDragon(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.WIND;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
