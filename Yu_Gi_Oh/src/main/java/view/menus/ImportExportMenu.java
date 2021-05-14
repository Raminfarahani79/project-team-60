package view.menus;

public class ImportExportMenu extends Menu {
    private static ImportExportMenu instance = new ImportExportMenu(MainMenu.getInstance());

    private ImportExportMenu(Menu parentMenu) {
        super("Import/Export", parentMenu);
    }

    public static ImportExportMenu getInstance(){
        return instance;
    }
    @Override
    public void run() {
        runMenuCommands();
    }
}
