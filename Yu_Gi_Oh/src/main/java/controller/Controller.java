package controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Controller {
    public Matcher getMatcher(String regex, String command) {
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(command);
    }

    public static void print(String output) {
        System.out.println(output);
    }
}
