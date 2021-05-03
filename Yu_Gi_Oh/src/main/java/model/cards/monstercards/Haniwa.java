package model.cards.monstercards;

public class Haniwa extends MonsterCard{
    public Haniwa(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.NORMAL;
        this.monsterType = MonsterType.ROCK;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
