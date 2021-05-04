package view;

import view.menus.LoginMenu;

import java.util.Scanner;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LoginMenu loginMenu = new LoginMenu(null);
        loginMenu.setScanner(scanner);
        loginMenu.runMenuCommands();
    }
}
