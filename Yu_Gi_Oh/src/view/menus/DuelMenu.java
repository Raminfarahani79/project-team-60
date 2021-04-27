package view.menus;

import controller.DuelMenuController;

public class DuelMenu extends Menu {
    public DuelMenu(Menu parentMenu) {
        super("Duel", parentMenu);
    }

    @Override
    public void run() {
        runMenuCommands();
    }
}
