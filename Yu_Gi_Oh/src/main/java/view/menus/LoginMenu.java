package view.menus;

import controller.LoginMenuController;
import model.User;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class LoginMenu extends Menu {
    private static LoginMenu instance = new LoginMenu(null);
    private LoginMenuController loginMenuController;

    private LoginMenu(Menu parentMenu) {
        super("Login", parentMenu);
        ArrayList<Menu> submenus = new ArrayList<>();
        submenus.add(MainMenu.getInstance());
        setSubMenus(submenus);
        loginMenuController = new LoginMenuController();
    }

    public static LoginMenu getInstance(){
        return instance;
    }

    @Override
    public void run() {
        loginMenuController.processCommand(input);
        runMenuCommands();
    }

}
