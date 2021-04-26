package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class MagnumShield extends SpellCard{
    public MagnumShield(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.EQUIP;
    }

    public void action(MonsterCard monster){

    }
}
