package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class PotOfGreed extends SpellCard{
    public PotOfGreed(String name, String description) {
        super(name, description);
        this.status = Status.LIMITED;
        this.icon = Icon.NORMAL;
        this.type = CardType.SPELL;
    }

    public void action(MonsterCard monster){

    }
}