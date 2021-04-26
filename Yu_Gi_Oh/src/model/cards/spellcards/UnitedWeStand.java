package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class UnitedWeStand extends SpellCard{
    public UnitedWeStand(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.EQUIP;
    }

    public void action(MonsterCard monster){

    }
}
