package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class MessengerOfPeace extends SpellCard{
    public MessengerOfPeace(String name, String description) {
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
