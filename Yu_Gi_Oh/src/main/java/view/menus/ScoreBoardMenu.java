package view.menus;


import controller.ScoreBoardMenuController;

public class ScoreBoardMenu extends Menu {
    private ScoreBoardMenuController scoreBoardMenuController;

    public ScoreBoardMenu(Menu parentMenu) {
        super("Scoreboard", parentMenu);
        scoreBoardMenuController = new ScoreBoardMenuController();
    }

    @Override
    public void run() {
        scoreBoardMenuController.processCommand(input);
        runMenuCommands();
    }
}
