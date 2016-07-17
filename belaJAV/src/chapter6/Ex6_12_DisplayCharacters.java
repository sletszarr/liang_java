package chapter6;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_12_DisplayCharacters {

    public static void main(String[] args) {

        printChars('A', 'z', 10);

    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {

        int charCount = 0;

        for (int i = ch1; i <= ch2; i++) {
            System.out.printf("%c ", i);

            if (++charCount % numberPerLine == 0) {
                System.out.println();
            }
        }
    }
}
