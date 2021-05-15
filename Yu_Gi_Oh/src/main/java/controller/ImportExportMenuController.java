package controller;

import com.google.gson.Gson;
import model.cards.Card;
import model.cards.CardFactory;
import model.cards.monstercards.MonsterCard;
import model.cards.spellcards.SpellCard;

import java.io.FileWriter;
import java.io.IOException;

public class ImportExportMenuController extends Controller{
    @Override
    public void processCommand(String command) throws IOException {
        if (command.matches("import card \\S+"))
            importCard(command.replace("import ",""));
        if (command.matches("export card \\S+"))
            exportCard(command.replace("import ", ""));
    }

    private void importCard(String cardName) throws IOException {
        Card card = CardFactory.getCardByCardName(cardName);
        FileWriter writer = null;
        if (card instanceof MonsterCard)
            writer = new FileWriter("Yu_Gi_Oh/src/main/java/model/cards/Monster.json");
        else if(card instanceof SpellCard)
            writer = new FileWriter("Yu_Gi_Oh/src/main/java/model/cards/Spell.json");
        else if (card instanceof SpellCard)
            writer = new FileWriter("Yu_Gi_Oh/src/main/java/model/cards/Trap.json");
        writer.write((new Gson()).toJson(card));
    }
    private void exportCard(String cardName) throws IOException {
        Card card = CardFactory.getCardByCardName(cardName);
        }
}
