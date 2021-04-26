package model.cards.monstercards;

public class AlexandriteDragon extends MonsterCard{
    public AlexandriteDragon(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.LIGHT;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
