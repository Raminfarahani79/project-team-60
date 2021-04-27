package view.menus;

import java.util.ArrayList;

public class LoginMenu extends Menu {

    public LoginMenu(Menu parentMenu) {
        super("Login", parentMenu);
        ArrayList<Menu> submenus = new ArrayList<>();
        submenus.add(new MainMenu(this));
        setSubMenus(submenus);
    }

    @Override
    public void run() {
        runMenuCommands();
    }
}
