package model.cards.monstercards;

public class GateGuardian extends MonsterCard{
    public GateGuardian(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.DARK;
        this.cardType = CardType.EFFECT;
        this.monsterType = MonsterType.WARRIOR;
    }

    public void action(MonsterCard monster){

    }
}
