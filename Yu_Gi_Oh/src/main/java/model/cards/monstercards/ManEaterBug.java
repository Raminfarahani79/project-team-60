package model.cards.monstercards;

public class ManEaterBug extends MonsterCard{
    public ManEaterBug(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.EFFECT;
        this.monsterType = MonsterType.INSECT;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
