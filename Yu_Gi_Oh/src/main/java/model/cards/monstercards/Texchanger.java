package model.cards.monstercards;

public class Texchanger extends MonsterCard{
    public Texchanger(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.DARK;
        this.cardType = CardType.EFFECT;
        this.monsterType = MonsterType.CYBERSE;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
