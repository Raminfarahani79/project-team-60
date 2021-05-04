package view.menus;

import model.User;

import java.util.regex.Matcher;

public class ProfileMenu extends Menu {
    public ProfileMenu(Menu parentMenu) {
        super("Profile", parentMenu);
    }

    @Override
    public void run() {
        runMenuCommands();
    }

    private void changeNickname(String command) {
        Matcher nicknameMatcher = getMatcher("--nickname (\\S+)", command);
        if (nicknameMatcher.find()) {
            String nickname = nicknameMatcher.group(1);
            for (User user : User.getAllUsers()) {
                if (user.getNickname().equals(nickname)) {
                    print("user with nickname " + nickname + " already exists");
                    return;
                }
            }
            User.currentUser.setNickname(nickname);
            print("nickname changed successfully!");
        }
    }

    private void changePassword(String command) {
        Matcher currentPasswordMatcher = getMatcher("--current (\\S+)", command);
        Matcher newPasswordMatcher = getMatcher("--new (\\S+)", command);
        if (currentPasswordMatcher.find() && newPasswordMatcher.find()) {
            String currentPassword = currentPasswordMatcher.group(1);
            String newPassword = newPasswordMatcher.group(1);
            if (!User.currentUser.getPassword().equals(currentPassword)) print("current password is invalid");
            else if (User.currentUser.getPassword().equals(newPassword)) print("￼please enter a new password");
            else {
                User.currentUser.setPassword(newPassword);
                print("password changed successfully!");
            }
        }
    }

}
