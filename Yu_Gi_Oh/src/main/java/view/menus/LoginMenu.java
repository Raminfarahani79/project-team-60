package view.menus;

import model.User;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class LoginMenu extends Menu {

    public LoginMenu(Menu parentMenu) {
        super("Login", parentMenu);
        ArrayList<Menu> submenus = new ArrayList<>();
        submenus.add(new MainMenu(this));
        setSubMenus(submenus);
    }

    @Override
    public void run() {
        runMenuCommands();
    }

    private void createUser(String command) {
        Matcher usernameMatcher = getMatcher("--username (\\S+)", command);
        Matcher nicknameMatcher = getMatcher("--nickname (\\S+)", command);
        Matcher passwordMatcher = getMatcher("--password (\\S+)", command);
        if (usernameMatcher.find() && nicknameMatcher.find() && passwordMatcher.find()) {
            String username = usernameMatcher.group(1);
            String nickname = nicknameMatcher.group(1);
            String password = passwordMatcher.group(1);
            for (User user: User.getAllUsers()) {
                if (user.getUsername().equals(username)) {
                    print("user with username "+username+" already exists");
                    return;
                }
                else if (user.getNickname().equals(nickname)){
                    print("user with nickname <nickname> already exists");
                    return;
                }
            }
            new User(username, password, nickname);
            print("user created successfully!");
        }
    }
    private void login(String command){
        Matcher usernameMatcher = getMatcher("--username (\\S+)", command);
        Matcher passwordMatcher = getMatcher("--password",command);
        if (usernameMatcher.find() && passwordMatcher.find()){
            String username = usernameMatcher.group(1);
            String password = passwordMatcher.group(1);
            if (!User.getAllUsers().contains(User.getUserByUsername(username))) print("Username and password didn’t match!");
            else if (!User.getUserByUsername(username).getPassword().equals(password)) print("Username and password didn’t match!");
            else {
                User.currentUser = User.getUserByUsername(username);
                print("￼user logged in successfully!");
            }
        }
    }
}
