package controller;

import model.game.Game;

public class DuelMenuController extends Controller {
    private static DuelMenuController instance;
    public Game game;

    private DuelMenuController() {
    }


    public static DuelMenuController getInstance() {
        return instance;
    }


    public void processCommand(String command) {
        if (command.matches("select -d")) deselectCard(command);
        else if (command.matches("select ((--spell \\d)|(--deck)|(--monster \\d)|(--field)|(--hand))"))
            selectFromOwnerCards(command.replace("select ", ""));
        else if (command.matches("select (?=.*(((--spell \\d)|(--deck)|(--monster \\d)|(field)) \\d))(?=.*(--opponent))((\\1 \\2)|(\\2 \\1))")) {
            command = command.replace("--opponent", "");
            selectFromOpponentCards(command.replace("select ", ""));
        } else if (command.matches("next phase")) nextPhase();
    }

    public void setGame(Game game) {
        this.game = game;
    }

    private void deselectCard(String command) {
        Game.getCurrentGame().setSelectedCard(null);
    }

    private void selectFromOpponentCards(String location) {
        if (game.getOpponentPlayer().getBoard().getCardInLocation(location) == null)
            print("no card found in the given position");
        else
            game.setSelectedCard(game.getOpponentPlayer().getBoard().getCardInLocation(location));
    }

    private void selectFromOwnerCards(String location) {
        if (game.getCurrentPlayer().getBoard().getCardInLocation(location) == null)
            print("no card found in the given position");
        else
            game.setSelectedCard(game.getCurrentPlayer().getBoard().getCardInLocation(location));
    }

    private void nextPhase() {
        Game.getCurrentGame().nextPhase();
        print("phase: " + Game.getCurrentGame().getPhase().toString());
    }

//    public void showGameBoard() {
//        StringBuilder board = new StringBuilder();
//        board.append(game.getCurrentPlayer().getBoard().show());
//        if (game.getCurrentPlayer() == game.getOpponentPlayer())
//            board.append(game.getUserPlayer().getBoard().show());
//        else
//            board.append(game.getOpponentPlayer().getBoard().show());
//        print(board.toString());
//    }
}
