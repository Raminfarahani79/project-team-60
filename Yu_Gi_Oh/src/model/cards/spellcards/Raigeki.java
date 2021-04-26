package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class Raigeki extends SpellCard{
    public Raigeki(String name, String description) {
        super(name, description);
        this.status = Status.LIMITED;
        this.icon = Icon.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}

