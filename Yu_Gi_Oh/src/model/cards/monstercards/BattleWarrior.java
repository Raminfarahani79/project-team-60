package model.cards.monstercards;

public class BattleWarrior extends MonsterCard{
    public BattleWarrior(String name, String description, int level, int attackPoint, int defencePoint) {
        super(name, description, level, attackPoint, defencePoint);
        this.attribute = Attribute.EARTH;
        this.cardType = CardType.NORMAL;
        this.monsterType = MonsterType.WARRIOR;
    }

    public void action(MonsterCard monster){

    }
}
