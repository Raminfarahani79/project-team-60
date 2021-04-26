package model.cards.monstercards;

public class CurtainOfTheDarkOnes extends MonsterCard{
    public CurtainOfTheDarkOnes(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.DARK;
        this.type = Type.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
