package view.menus;

public class ScoreBoardMenu extends Menu {
    public ScoreBoardMenu(Menu parentMenu) {
        super("Scoreboard", parentMenu);
    }

    @Override
    public void run() {
        runMenuCommands();
    }
}
