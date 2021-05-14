package view.menus;


import controller.ScoreBoardMenuController;

public class ScoreBoardMenu extends Menu {
    private static ScoreBoardMenu instance = new ScoreBoardMenu(MainMenu.getInstance());
    private ScoreBoardMenuController scoreBoardMenuController;

    private ScoreBoardMenu(Menu parentMenu) {
        super("Scoreboard", parentMenu);
        scoreBoardMenuController = new ScoreBoardMenuController();
    }

    public static ScoreBoardMenu getInstance(){
        return instance;
    }

    @Override
    public void run() {
        scoreBoardMenuController.processCommand(input);
        runMenuCommands();
    }
}
