package model.cards.monstercards;

public class SilverFang extends MonsterCard{
    public SilverFang(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.NORMAL;
        this.monsterType = MonsterType.BEAST;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
