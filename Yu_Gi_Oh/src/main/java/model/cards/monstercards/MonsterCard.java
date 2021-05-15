package model.cards.monstercards;
import model.User;
import model.cards.Card;
import model.cards.Position;
import view.menus.DuelMenu;

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

    public MonsterCard(String name, String description, int level, int attackPoint, int defencePoint,int price){
        super(name, description,price);
        setLevel(level);
        setAttackPoint(attackPoint);
        setDefencePoint(defencePoint);
        setAttacked(false);
        setSwitchedPosition(false);
    }

    public void action(){
        attackLifePoint();
        this.setAttacked(true);
    }

    public void action(MonsterCard monster){
        if (monster != null) {
            attackMonster(monster);
        }
        this.setAttacked(true);
    }

    public void attackMonster(MonsterCard target){

        Player active = DuelMenu.getPlayerUser();
        Player opponent = DuelMenu.getOpponentUser();

        if (target.getPosition() == Position.ATTACK) {

            if (this.getAttackPoint() > target.getAttackPoint()) {

                int damage = this.getAttackPoint() - target.getAttackPoint();
                opponent.removeMonsterToGraveyard(target);
                int lp = opponent.getLifePoint();
                opponent.setLifePoint(lp - damage);

            } else if (this.getAttackPoint() == target.getAttackPoint()) {

                active.removeMonsterToGraveyard(this);
                opponent.removeMonsterToGraveyard(target);
                this.setAttacked(true);

            } else {

                int damage = target.getAttackPoint() - this.getAttackPoint();
                active.removeMonsterToGraveyard(this);
                int lp = active.getLifePoint();
                active.setLifePoint(lp - damage);

            }

        } else {

            if (this.getAttackPoint() > target.getDefencePoint()) {

                opponent.removeMonsterToGraveyard(target);
                this.setAttacked(true);

            } else if (this.getAttackPoint() == target.getAttackPoint()) {

                this.setAttacked(true);
                this.setHidden(true);

            } else {

                int damage = target.getDefencePoint() - this.getAttackPoint();
                int lp = active.getLifePoint();
                active.setLifePoint(lp - damage);
                this.setHidden(true);

            }
        }

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
        int lifePoint = DuelMenu.getOpponentUser().getLifePoint();
        DuelMenu.getOpponentUser().setLifePoint(lifePoint - this.getAttackPoint());
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
                "Name: " + getName() +
                "Level: " + level +
                "Type: " + monsterType +
                "ATK: " + attackPoint +
                "DEF: " + defencePoint +
                "Description:" + getDescription();
    }
}
