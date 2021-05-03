package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class DarkHole extends Raigeki{
    public DarkHole(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.NORMAL;
        this.type = CardType.SPELL;
    }

    public void action(MonsterCard monster){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
