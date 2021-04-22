package view.menus;

import java.util.ArrayList;

public class LoginMenu extends Menu{

    public LoginMenu( Menu parentMenu) {
        super("Login Menu", parentMenu);
        ArrayList<Menu> submenus = new ArrayList<>();
        submenus.add(new MainMenu(this));
        setSubMenus(submenus);
    }

    public void run(){

    }
}
