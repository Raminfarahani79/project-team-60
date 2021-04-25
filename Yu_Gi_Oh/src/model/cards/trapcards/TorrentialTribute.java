package model.cards.trapcards;

import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.Icon;
import model.cards.spellcards.Status;

public class TorrentialTribute extends TrapCard{
    public TorrentialTribute(String name, String description) {
        super(name, description);
        this.icon = Icon.NORMAL;
        this.status = Status.LIMITED;
    }

    public void action(MonsterCard monster){

    }
}
