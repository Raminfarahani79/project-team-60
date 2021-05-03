package model.cards.monstercards;

public class CommandKnight extends MonsterCard {
    public CommandKnight(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.FIRE;
        this.cardType = CardType.EFFECT;
        this.monsterType = MonsterType.WARRIOR;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
