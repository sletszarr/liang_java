package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_18_CheckPassword {

    public static void main(String[] args) {

        System.out.println(isValidPassword("pat4buru9*"));

    }

    public static boolean isValidPassword(String password) {

        int digitCount = 0;
        int charCount = 0;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
                charCount++;
                if (Character.isDigit(password.charAt(i))) {
                    digitCount++;
                }
            }
            else {
                return false;
            }
        }

        return digitCount >= 2 && charCount >= 8;
    }
}
