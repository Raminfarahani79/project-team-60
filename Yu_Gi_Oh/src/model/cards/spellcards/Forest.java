package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class Forest extends SpellCard{
    public Forest(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.FIELD;
    }

    public void action(MonsterCard monster){

    }
}
