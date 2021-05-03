package model.cards.monstercards;

public class SlotMachine extends MonsterCard{
    public SlotMachine(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.DARK;
        this.cardType = CardType.NORMAL;
        this.monsterType = MonsterType.MACHINE;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
