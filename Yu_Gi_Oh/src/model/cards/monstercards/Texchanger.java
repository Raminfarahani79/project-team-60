package model.cards.monstercards;

public class Texchanger extends MonsterCard{
    public Texchanger(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.DARK;
        this.cardType = CardType.EFFECT;
    }

    public void action(MonsterCard monster){

    }
}
