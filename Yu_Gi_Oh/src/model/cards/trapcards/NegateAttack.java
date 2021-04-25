package model.cards.trapcards;

import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.Icon;
import model.cards.spellcards.Status;

public class NegateAttack extends TrapCard{
    public NegateAttack(String name, String description) {
        super(name, description);
        this.icon = Icon.COUNTER;
        this.status = Status.UNLIMITED;
    }

    public void action(MonsterCard monster){

    }
}
