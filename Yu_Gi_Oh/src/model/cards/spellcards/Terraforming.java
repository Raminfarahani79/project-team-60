package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class Terraforming extends SpellCard{
    public Terraforming(String name, String description) {
        super(name, description);
        this.status = Status.LIMITED;
        this.icon = Icon.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
