package chapter6;

/**
 * Created by bnamora on 6/29/16.
 */

public class Eg6_11_TestRandomCharacter {

    public static void main(String[] args) {

        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;
        char ch;

        for (int i = 1; i <= NUMBER_OF_CHARS; i++) {

            ch = Eg6_10_RandomCharacter.getRandomLowerCaseLetter();

            System.out.print(ch);
            if (i % CHARS_PER_LINE == 0) {
                System.out.println();
            }
        }

    }
}
