package model.cards.monstercards;
import model.cards.Card;
import model.cards.Position;

public class MonsterCard extends Card {
    protected int level;
    protected int defencePoint;
    protected int attackPoint;
    protected boolean switchedPosition;
    protected boolean attacked;
    protected Position position = Position.DEFENCE;
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

    public void attackMonster(MonsterCard target){

    }

    public void switchPosition(){
        if(position == Position.ATTACK){
            position = Position.DEFENCE;
            setHidden(true);
        }
        else{
            position = Position.ATTACK;
            setHidden(false);
        }
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

    @Override
    public String toString() {
        return
                "Name: " + name +
                "Level: " + level +
                "Type: " + monsterType +
                "ATK: " + attackPoint +
                "DEF: " + defencePoint +
                "Description:" + description;
    }
}
