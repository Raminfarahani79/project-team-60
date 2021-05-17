package view;


import model.cards.CardFactory;
import view.menus.LoginMenu;

import java.util.Scanner;



public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        CardFactory.readCVSOfCards();
        LoginMenu loginMenu = new LoginMenu(null);
        loginMenu.setScanner(scanner);
        loginMenu.runMenuCommands();

    }
}
