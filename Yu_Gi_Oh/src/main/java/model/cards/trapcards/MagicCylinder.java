package model.cards.trapcards;

import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.CardType;
import model.cards.spellcards.Icon;
import model.cards.spellcards.Status;

public class MagicCylinder extends TrapCard{
    public MagicCylinder(String name, String description) {
        super(name, description);
        this.icon = Icon.NORMAL;
        this.status = Status.UNLIMITED;
        this.type = CardType.TRAP;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
