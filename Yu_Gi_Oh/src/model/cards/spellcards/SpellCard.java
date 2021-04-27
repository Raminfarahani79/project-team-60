package model.cards.spellcards;
import model.cards.Card;
import model.cards.monstercards.MonsterCard;

public abstract class SpellCard extends Card {
    Status status;
    Icon icon;
    CardType type;

    public SpellCard(String name, String description){
        super(name,description);
    }

    public abstract void action(MonsterCard monster);
}
