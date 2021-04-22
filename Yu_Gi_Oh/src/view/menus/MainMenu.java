package view.menus;

import java.util.ArrayList;

public class MainMenu extends Menu{
    public MainMenu(Menu parentMenu) {
        super("Main Menu", parentMenu);
        ArrayList<Menu> submenus = new ArrayList<>();
        submenus.add(new DeckMenu(this));
        submenus.add(new DuelMenu(this));
        submenus.add(new ProfileMenu(this));
        submenus.add(new ScoreBoardMenu(this));
        submenus.add(new ShopMenu(this));
        submenus.add(new ImportExportMenu(this));
        setSubMenus(submenus);
    }
}
