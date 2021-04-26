package model.cards.monstercards;

public class WarriorDaiGrepher extends MonsterCard{
    public WarriorDaiGrepher(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
