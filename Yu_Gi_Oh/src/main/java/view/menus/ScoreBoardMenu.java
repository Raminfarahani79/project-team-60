package view.menus;

import model.User;

import java.util.Comparator;

public class ScoreBoardMenu extends Menu {
    public ScoreBoardMenu(Menu parentMenu) {
        super("Scoreboard", parentMenu);
    }

    @Override
    public void run() {
        runMenuCommands();
        if (input.matches("scoreboard show")) showScoreboard();
        else print("invalid command");
    }

    private void showScoreboard() {
        int counter = 1;
        Comparator<User> userComparator = Comparator.comparing(User::getScore).thenComparing(User::getNickname);
        User.getAllUsers().sort(userComparator);
        int previousScore = User.getAllUsers().get(counter).getScore();
        for (User user : User.getAllUsers()) {
            if (user.getScore() != previousScore) counter++;
            print(counter + "- " + user.getNickname() + ": " + user.getScore());
            previousScore = user.getScore();
        }
    }
}
