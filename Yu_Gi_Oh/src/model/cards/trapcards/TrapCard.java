package model.cards.trapcards;
import model.cards.Card;
import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.Icon;
import model.cards.spellcards.Status;

public abstract class TrapCard extends Card {
    Status status;
    Icon icon;

    public TrapCard(String name, String description){
        super(name,description);
    }

    public abstract void action(MonsterCard monster);
}
