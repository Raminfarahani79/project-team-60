package view.menus;

import controller.ShopMenuController;
import model.User;


public class ShopMenu extends Menu {
    private static ShopMenu instance = new ShopMenu(MainMenu.getInstance());
    private ShopMenuController shopMenuController;

    private ShopMenu(Menu parentMenu) {
        super("Shop", parentMenu);
        shopMenuController = new ShopMenuController();
    }

    public static ShopMenu getInstance() {
        return instance;
    }

    @Override
    public void run() {
        shopMenuController.processCommand(input);
        runMenuCommands();
    }
}
