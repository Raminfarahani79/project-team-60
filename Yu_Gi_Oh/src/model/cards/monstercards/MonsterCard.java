package model.cards.monstercards;
import model.cards.Card;
import model.cards.Position;

public class MonsterCard extends Card {
    private int level;
    private int defencePoint;
    private int attackPoint;
    private boolean switchedPosition;
    private boolean attacked;
    private Position position = Position.DEFENCE;
    protected CardType cardType;
    protected Attribute attribute;
    protected MonsterType monsterType;

    public MonsterCard(String name, String description, int level, int attackPoint, int defencePoint){
        super(name, description);
        setLevel(level);
        setAttackPoint(attackPoint);
        setDefencePoint(defencePoint);
        setAttacked(false);
        setSwitchedPosition(false);
    }

    public void action(){

    }

    public void action(MonsterCard monster){

    }

    public void attackMonster(){

    }

    public void switchPosition(){

    }

    public void attackLifePoint(){

    }

    public void setAttacked(boolean attacked) {
        this.attacked = attacked;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDefencePoint(int defencePoint) {
        this.defencePoint = defencePoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public void setSwitchedPosition(boolean switchedPosition) {
        this.switchedPosition = switchedPosition;
    }

    public boolean isAttacked() {
        return attacked;
    }

    public void setHidden(boolean hidden){
        super.setHidden(hidden);
    }

    public void setPosition(Position position){
        this.position = position;
    }
    public int getLevel() {
        return level;
    }

    public int getDefencePoint() {
        return defencePoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public boolean isSwitchedPosition() {
        return switchedPosition;
    }

    public Position getPosition() {
        return position;
    }
}
