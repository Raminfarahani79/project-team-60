package model.cards.monstercards;

public class TheTricky extends MonsterCard{
    public TheTricky(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.WIND;
        this.cardType = CardType.EFFECT;
        this.monsterType = MonsterType.SPELL_CASTER;
    }

    public void action(MonsterCard monster){

    }
}
