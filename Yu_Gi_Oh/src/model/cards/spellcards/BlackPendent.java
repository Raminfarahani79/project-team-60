package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class BlackPendent extends SpellCard{
    public BlackPendent(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.EQUIP;
    }

    public void action(MonsterCard monster){

    }
}
