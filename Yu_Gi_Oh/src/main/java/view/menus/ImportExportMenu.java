package view.menus;

public class ImportExportMenu extends Menu {
    public ImportExportMenu(Menu parentMenu) {
        super("Import/Export", parentMenu);
    }

    @Override
    public void run() {
        runMenuCommands();
    }
}
