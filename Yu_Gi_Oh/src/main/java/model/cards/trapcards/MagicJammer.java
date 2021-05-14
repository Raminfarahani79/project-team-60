package model.cards.trapcards;

import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.CardType;
import model.cards.spellcards.Icon;
import model.cards.spellcards.Status;

public class MagicJammer extends TrapCard{
    public MagicJammer(String name, String description, int price) {
        super(name, description, price);
        this.icon = Icon.COUNTER;
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
