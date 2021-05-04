package view.menus;

import java.util.ArrayList;

public class MainMenu extends Menu {
    public MainMenu(Menu parentMenu) {
        super("Main", parentMenu);
        ArrayList<Menu> submenus = new ArrayList<>();
        submenus.add(new DeckMenu(this));
        submenus.add(new DuelMenu(this));
        submenus.add(new ProfileMenu(this));
        submenus.add(new ScoreBoardMenu(this));
        submenus.add(new ShopMenu(this));
        submenus.add(new ImportExportMenu(this));
        setSubMenus(submenus);
    }

    @Override
    public void run() {
        runMenuCommands();
        if (input.matches())
    }
}
