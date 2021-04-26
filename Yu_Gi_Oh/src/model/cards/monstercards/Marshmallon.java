package model.cards.monstercards;

public class Marshmallon extends MonsterCard {
    public Marshmallon(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.LIGHT;
        this.type = Type.EFFECT;
    }

    public void action(MonsterCard monster){

    }
}
