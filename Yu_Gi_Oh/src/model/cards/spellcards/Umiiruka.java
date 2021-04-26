package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class Umiiruka extends SpellCard{
    public Umiiruka(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.FIELD;
    }

    public void action(MonsterCard monster){

    }
}
