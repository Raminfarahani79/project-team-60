package controller;

import view.menus.Menu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Controller {
    protected abstract void processCommand(String command);

    public Matcher getMatcher(String regex, String command) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(command);
    }

    public static void print(String output) {
        Menu.print(output);
    }
}
