package view.menus;

import controller.DeckMenuController;

public class DeckMenu extends Menu {
    private static DeckMenu instance;
    private DeckMenuController deckMenuController;

    protected DeckMenu(Menu parentMenu) {
        super("Deck", parentMenu);
        deckMenuController = new DeckMenuController();
        instance = this;
    }

    public static DeckMenu getInstance() {
        return instance;
    }

    @Override
    public void run() {
        deckMenuController.processCommand(input);
        runMenuCommands();
    }

}
