package view.menus;

import controller.DuelMenuController;



public class DuelMenu extends Menu {
    private DuelMenuController duelMenuController;
    public DuelMenu(Menu parentMenu) {
        super("Duel", parentMenu);
        duelMenuController = new DuelMenuController();
    }

    @Override
    public void run() {
        duelMenuController.processCommand(input);
        runMenuCommands();
    }
}
