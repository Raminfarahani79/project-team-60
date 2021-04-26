package view.menus;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Menu {
    private String name;
    private Menu parentMenu;
    private ArrayList<Menu> subMenus;
    protected static Scanner scan;
    protected String input = "";

    public Menu(String name, Menu parentMenu) {
        this.name = name;
        this.parentMenu = parentMenu;
    }

    public static void setScanner(Scanner scanner) {
        scan = scanner;
    }

    public void setSubMenus(ArrayList<Menu> subMenus) {
        this.subMenus = subMenus;
    }

    public void run() {
        input = scan.nextLine();
        if (input.matches("menu exit")) {
            if (this.parentMenu != null)
                parentMenu.run();
            else System.exit(1);
        } else if (input.matches("menu show-current")) {
            print(this.name);
            this.run();
        } else if (input.matches("menu enter \\S+")) {
            String[] inputSplit = input.split("\\s");
            int counter = -1;
            for (Menu subMenu : this.subMenus) {
                counter++;
                if (subMenu.name.matches(inputSplit[2])) break;
            }
            if (counter <= subMenus.size() - 1)
                this.subMenus.get(counter).run();
            else {
                print("menu navigation is not possible");
                this.run();
            }
        }
    }

    public static void print(String output) {
        System.out.println(output);
    }


}
