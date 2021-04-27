package model.cards.monstercards;

public class SlotMachine extends MonsterCard{
    public SlotMachine(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.DARK;
        this.cardType = CardType.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
