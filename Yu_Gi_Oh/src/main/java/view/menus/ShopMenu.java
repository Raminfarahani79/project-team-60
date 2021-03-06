package view.menus;

import controller.ShopMenuController;
import model.User;


public class ShopMenu extends Menu {
    private ShopMenuController shopMenuController;

    protected ShopMenu(Menu parentMenu) {
        super("Shop", parentMenu);
        shopMenuController = new ShopMenuController();
    }

    @Override
    public void run() {
        shopMenuController.processCommand(input);
        runMenuCommands();
    }
}
