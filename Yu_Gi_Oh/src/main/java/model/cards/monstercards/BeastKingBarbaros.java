package model.cards.monstercards;

public class BeastKingBarbaros extends MonsterCard {

    public BeastKingBarbaros(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.EFFECT;
        this.monsterType = MonsterType.BEAST_WARRIOR;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
