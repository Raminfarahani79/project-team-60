package model.cards.monstercards;

public class ExploderDragon extends MonsterCard{
    public ExploderDragon(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.LIGHT;
        this.cardType = CardType.EFFECT;
    }

    public void action(MonsterCard monster){

    }
}
