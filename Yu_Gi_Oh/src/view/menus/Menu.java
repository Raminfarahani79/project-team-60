package view.menus;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Menu {
    private String name;
    private Menu parentMenu;
    private ArrayList<Menu> subMenus;
    protected Scanner scanner;

    public Menu(String name, Menu parentMenu) {
        this.name = name;
        this.parentMenu = parentMenu;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public void setSubMenus(ArrayList<Menu> subMenus) {
        this.subMenus = subMenus;
    }

    public void run() {
        String input = scanner.nextLine();
        if (input.matches("menu exit")) {
            if (this.parentMenu != null)
                parentMenu.run();
            else System.exit(1);
        } else if (input.matches("menu show-current")) {
            System.out.println(this.name);
        }
    }

}
