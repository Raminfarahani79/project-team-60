package view;


import view.menus.LoginMenu;

import java.util.Scanner;

public class CommandProcessor {
    java.util.Scanner scanner = new Scanner(System.in);

    public void runMenus() {
        LoginMenu loginMenu = new LoginMenu(null);
        loginMenu.setScanner(scanner);
        loginMenu.run();
    }
}
