package view.menus;

public class ProfileMenu extends Menu {
    public ProfileMenu(Menu parentMenu) {
        super("Profile", parentMenu);
    }

    @Override
    public void run() {
        runMenuCommands();
    }
}
