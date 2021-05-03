package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class SupplySquad extends SpellCard{
    public SupplySquad(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.CONTINUOUS;
        this.type = CardType.SPELL;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
