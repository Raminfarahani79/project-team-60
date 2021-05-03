package model.cards.monstercards;

public class CurtainOfTheDarkOnes extends MonsterCard{
    public CurtainOfTheDarkOnes(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.DARK;
        this.cardType = CardType.NORMAL;
        this.monsterType = MonsterType.SPELL_CASTER;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
