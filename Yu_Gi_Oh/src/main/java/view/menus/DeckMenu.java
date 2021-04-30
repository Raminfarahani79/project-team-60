package view.menus;

import controller.DeckMenuController;

public class DeckMenu extends Menu {
    private DeckMenuController deckMenuController;
    public DeckMenu(Menu parentMenu) {
        super("Deck", parentMenu);
        deckMenuController = new DeckMenuController();
    }

    @Override
    public void run() {
        deckMenuController.processCommand(input);
        runMenuCommands();
    }

}
