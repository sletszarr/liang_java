package chapter6;

/**
 * Created by Acer-756 on 7/2/2016.
 */

public class Ex6_38_GenerateRandomCharacters {

    public static void main(String[] args) {

        final int DIGITS_PER_LINE = 10;
        int charCount = 0;

        for (int i = 0; i < 100; i++) {
            System.out.printf("%c ", Eg6_10_RandomCharacter.getRandomUpperCaseLetter());
            if (++charCount % DIGITS_PER_LINE == 0) {
                System.out.println();
            }
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("%c ", Eg6_10_RandomCharacter.getRandomDigitCharacter());
            if (++charCount % DIGITS_PER_LINE == 0) {
                System.out.println();
            }
        }

    }

}
