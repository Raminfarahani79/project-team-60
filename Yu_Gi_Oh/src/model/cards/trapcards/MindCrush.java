package model.cards.trapcards;

import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.Icon;
import model.cards.spellcards.Status;

public class MindCrush extends TrapCard{
    public MindCrush(String name, String description) {
        super(name, description);
        this.icon = Icon.NORMAL;
        this.status = Status.UNLIMITED;
    }

    public void action(MonsterCard monster){

    }
}
