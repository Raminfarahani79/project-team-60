package model.cards.monstercards;

public class FireYarou extends MonsterCard{
    public FireYarou(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.FIRE;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
