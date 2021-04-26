package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class ChangeOfHeart extends SpellCard{
    public ChangeOfHeart(String name, String description) {
        super(name, description);
        this.status = Status.LIMITED;
        this.icon = Icon.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}


