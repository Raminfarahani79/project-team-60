package model.cards.spellcards;

import model.cards.monstercards.MonsterCard;

public class MysticalSpaceTyphoon extends SpellCard{
    public MysticalSpaceTyphoon(String name, String description) {
        super(name, description);
        this.status = Status.UNLIMITED;
        this.icon = Icon.QUICK_PLAY;
        this.type = CardType.SPELL;
    }

    public void action(MonsterCard monster){

    }
}
