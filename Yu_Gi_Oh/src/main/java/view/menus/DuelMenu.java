package view.menus;

import controller.DuelMenuController;
import model.User;


public class DuelMenu extends Menu {
    private DuelMenuController duelMenuController;
    public DuelMenu(Menu parentMenu) {
        super("Duel", parentMenu);
        duelMenuController = new DuelMenuController();
    }

    public static User getOpponentUser() {
    }

    public static User getPlayerUser() {
    }

    @Override
    public void run() {
        duelMenuController.processCommand(input);
        runMenuCommands();
    }
}
