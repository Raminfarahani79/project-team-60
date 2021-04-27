package model.cards.monstercards;

public class BattleOX extends MonsterCard{
    public BattleOX(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.NORMAL;
        this.monsterType = MonsterType.BEAST_WARRIOR;
    }

    public void action(MonsterCard monster){

    }
}
