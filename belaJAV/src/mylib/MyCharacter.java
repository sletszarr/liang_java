package mylib;

/**
 * Created by bnamora on 7/29/16.
 */

public class MyCharacter {

    char ch;

    public MyCharacter(char ch) {
        this.ch = ch;
    }

    public static boolean isDigit(char ch) {
        return ('0' <= ch && ch <= '9');
    }

    public static boolean isLetter(char ch) {
        return ('A' <= ch && ch <= 'z');
    }

    public static boolean isLetterOrDigit(char ch) {
        return isDigit(ch) || isLetter(ch);
    }

    public static boolean isLowerCase(char ch) {
        return ('a' <= ch && ch <= 'z');
    }

    public static boolean isUpperCase(char ch) {
        return ('A' <= ch && ch <= 'Z');
    }

    public static char toLowerCase(char ch) {
        if ('A' <= ch && ch <= 'Z')
            ch += ('a' - 'A');
        return ch;
    }

    public static char toUpperCase(char ch) {
        if ('a' <= ch && ch <= 'z')
            ch += ('A' - 'a');
        return ch;
    }

}
