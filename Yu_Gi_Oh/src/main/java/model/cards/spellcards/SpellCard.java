package model.cards.spellcards;
import model.cards.Card;
import model.cards.monstercards.MonsterCard;

public abstract class SpellCard extends Card {
    protected Status status;
    protected Icon icon;
    protected CardType type;

    public SpellCard(String name, String description, int price){
        super(name, description, price);
    }

    public abstract void action(MonsterCard monster);

    @Override
    public String toString() {
        return "Name: " + getName() +
                "Trap" +
                "Type: " + type +
                "Description: " + getDescription() ;
    }
}
