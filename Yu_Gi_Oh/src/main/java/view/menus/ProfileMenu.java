package view.menus;

import controller.ProfileMenuController;

public class ProfileMenu extends Menu {
    private ProfileMenuController profileMenuController;

    protected ProfileMenu(Menu parentMenu) {
        super("Profile", parentMenu);
        profileMenuController = new ProfileMenuController();
    }


    @Override
    public void run() {
        profileMenuController.processCommand(input);
        runMenuCommands();
    }

}
