package view.menus;

import controller.DuelMenuController;


public class DuelMenu extends Menu {
    private static DuelMenu instance = new DuelMenu(MainMenu.getInstance());
    private DuelMenuController duelMenuController;

    private DuelMenu(Menu parentMenu) {
        super("Duel", parentMenu);
        duelMenuController = DuelMenuController.getInstance();
    }

    public static DuelMenu getInstance() {
        return instance;
    }

    @Override
    public void run() {
        duelMenuController.processCommand(input);
        runMenuCommands();
    }
}
