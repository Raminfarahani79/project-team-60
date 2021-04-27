package model.cards.monstercards;

public class BeastKingBarbaros extends MonsterCard {

    public BeastKingBarbaros(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.EFFECT;
    }

    public void action(MonsterCard monster){

    }


}
