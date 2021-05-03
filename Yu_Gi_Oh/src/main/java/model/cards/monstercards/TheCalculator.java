package model.cards.monstercards;

public class TheCalculator extends MonsterCard{
    public TheCalculator(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.LIGHT;
        this.cardType = CardType.EFFECT;
        this.monsterType = MonsterType.THUNDER;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
