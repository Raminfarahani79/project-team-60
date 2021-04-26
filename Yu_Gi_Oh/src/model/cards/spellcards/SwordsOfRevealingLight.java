package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class SwordsOfRevealingLight extends SpellCard{
    public SwordsOfRevealingLight(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
