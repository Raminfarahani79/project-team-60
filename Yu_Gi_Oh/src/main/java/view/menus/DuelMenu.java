package view.menus;

import controller.DuelMenuController;


public class DuelMenu extends Menu {
    private static DuelMenu instance;
    private DuelMenuController duelMenuController;

    protected DuelMenu(Menu parentMenu) {
        super("Duel", parentMenu);
        duelMenuController = DuelMenuController.getInstance();
        instance = this;
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
