package view;


import view.menus.LoginMenu;

import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("model.cards.Card");
        LoginMenu.getInstance().setScanner(scanner);
        LoginMenu.getInstance().runMenuCommands();

    }
}
