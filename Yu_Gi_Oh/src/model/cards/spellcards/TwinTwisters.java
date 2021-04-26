package model.cards.spellcards;


import model.cards.monstercards.MonsterCard;

public class TwinTwisters extends SpellCard{


    public TwinTwisters(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.QUICK_PLAY;
    }

    public void action(MonsterCard monster){

    }
}
