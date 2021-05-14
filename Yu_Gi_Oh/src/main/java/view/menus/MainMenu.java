package view.menus;

import controller.MainMenuController;
import view.Main;

import java.util.ArrayList;

public class MainMenu extends Menu {
    private MainMenuController mainMenuController;
    private static MainMenu instance = new MainMenu(LoginMenu.getInstance());

    private MainMenu(Menu parentMenu) {
        super("Main", parentMenu);
        ArrayList<Menu> submenus = new ArrayList<>();
        submenus.add(DeckMenu.getInstance());
        submenus.add(DeckMenu.getInstance());
        submenus.add(ProfileMenu.getInstance());
        submenus.add(ScoreBoardMenu.getInstance());
        submenus.add(ShopMenu.getInstance());
        submenus.add(ImportExportMenu.getInstance());
        setSubMenus(submenus);
        mainMenuController = new MainMenuController();
    }

    public static MainMenu getInstance() {
        return instance;
    }

    @Override
    public void run() {
        mainMenuController.processCommand(input);
        runMenuCommands();
    }
}
