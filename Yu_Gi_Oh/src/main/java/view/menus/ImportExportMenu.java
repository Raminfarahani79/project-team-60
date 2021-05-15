package view.menus;

import controller.ImportExportMenuController;

import java.io.IOException;

public class ImportExportMenu extends Menu {
    private static ImportExportMenu instance = new ImportExportMenu(MainMenu.getInstance());
    private ImportExportMenuController importExportMenuController;

    private ImportExportMenu(Menu parentMenu) {
        super("Import/Export", parentMenu);
        importExportMenuController = new ImportExportMenuController();
    }

    public static ImportExportMenu getInstance(){
        return instance;
    }
    @Override
    public void run() throws IOException {
        importExportMenuController.processCommand(input);
        runMenuCommands();
    }
}
