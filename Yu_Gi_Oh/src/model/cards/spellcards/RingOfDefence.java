package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class RingOfDefence extends SpellCard{
    public RingOfDefence(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.QUICK_PLAY;
    }

    public void action(MonsterCard monster){

    }
}
