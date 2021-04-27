package model.cards.monstercards;

public class MirageDragon extends MonsterCard{
    public MirageDragon(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.LIGHT;
        this.cardType = CardType.EFFECT;
    }

    public void action(MonsterCard monster){

    }
}
