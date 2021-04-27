package model.cards.monstercards;

public class BabyDragon extends MonsterCard{
    public BabyDragon(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.WIND;
        this.cardType = CardType.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
