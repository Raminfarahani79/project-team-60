package model.cards.monstercards;

public class AxeRaide extends MonsterCard{
    public AxeRaide(String name, String description, int level, int attackPoint, int defencePoint,int price) {
        super(name, description, level, attackPoint, defencePoint, price);
        this.attribute = Attribute.EARTH;
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
