package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class SwordOfDarkDestruction extends SpellCard{
    public SwordOfDarkDestruction(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.EQUIP;
    }

    public void action(MonsterCard monster){

    }
}
