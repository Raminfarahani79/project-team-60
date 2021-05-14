package model.cards.trapcards;

import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.CardType;
import model.cards.spellcards.Icon;
import model.cards.spellcards.Status;

public class TimeSeal extends TrapCard{
    public TimeSeal(String name, String description, int price) {
        super(name, description, price);
        this.icon = Icon.NORMAL;
        this.status = Status.LIMITED;
        this.type = CardType.TRAP;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
