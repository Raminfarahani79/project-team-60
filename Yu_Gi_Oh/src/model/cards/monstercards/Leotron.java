package model.cards.monstercards;

public class Leotron extends MonsterCard{
    public Leotron(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
