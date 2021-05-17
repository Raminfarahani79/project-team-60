package model.cards.trapcards;

import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.AdvancedRitualArt;
import model.cards.spellcards.CardType;
import model.cards.spellcards.Icon;
import model.cards.spellcards.Status;

public class MindCrush extends TrapCard{
    public MindCrush(String name, String description, int price) {
        super(name, description, price);
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

    public Object clone() {
        return new MindCrush(this.name, this.description, this.price);
    }
}
