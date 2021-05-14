package view.menus;

import controller.ProfileMenuController;

public class ProfileMenu extends Menu {
    private static ProfileMenu instance = new ProfileMenu(MainMenu.getInstance());
    private ProfileMenuController profileMenuController;

    private ProfileMenu(Menu parentMenu) {
        super("Profile", parentMenu);
        profileMenuController = new ProfileMenuController();
    }

    public static ProfileMenu getInstance() {
       return instance;
    }

    @Override
    public void run() {
        profileMenuController.processCommand(input);
        runMenuCommands();
    }

}
