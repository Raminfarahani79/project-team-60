package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class DarkHole extends Raigeki{
    public DarkHole(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.NORMAL;
    }

    public void action(MonsterCard monster){

    }
}
