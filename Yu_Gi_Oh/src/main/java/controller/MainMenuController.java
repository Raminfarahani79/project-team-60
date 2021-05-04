package controller;

import model.User;
import view.menus.LoginMenu;
import view.menus.Menu;
import view.menus.ProfileMenu;

public class MainMenuController extends Controller {
    public void processCommand(String command) {
        if (command.matches("￼user logout")) logout();
        else print("invalid command");
    }

    private void logout() {
        User.currentUser = null;
        print("user logged out successfully!");
        new LoginMenu(null).runMenuCommands();
    }
}
