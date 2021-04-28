package model.cards.spellcards;
import model.cards.Card;
import model.cards.monstercards.MonsterCard;

public abstract class SpellCard extends Card {
    protected Status status;
    protected Icon icon;
    protected CardType type;

    public SpellCard(String name, String description){
        super(name,description);
    }

    public abstract void action(MonsterCard monster);
}
