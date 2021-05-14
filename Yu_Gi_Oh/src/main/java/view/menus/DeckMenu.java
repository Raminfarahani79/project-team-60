package view.menus;

import controller.DeckMenuController;

public class DeckMenu extends Menu {
    private static DeckMenu instance = new DeckMenu(MainMenu.getInstance());
    private DeckMenuController deckMenuController;

    private DeckMenu(Menu parentMenu) {
        super("Deck", parentMenu);
        deckMenuController = new DeckMenuController();
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
