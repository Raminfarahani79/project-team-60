package controller;

import model.Phases;
import view.menus.Menu;

public class DuelMenuController {
    private Phases phase = Phases.DRAW;

    public void processCommand(String command) {
        if (command.matches("select -d")) deselect(command);
        else if (command.matches("select \\S+")) selectCard(command);
        else if (command.matches("next phase")) nextPhase();
    }

    private void deselect(String command) {}
    private void selectCard(String command) {}
    private void nextPhase() {
        phase = phase.next();
        Menu.print("phase: "+phase.toString());
    }
}
