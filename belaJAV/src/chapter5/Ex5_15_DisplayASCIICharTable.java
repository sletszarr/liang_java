package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */
public class Ex5_15_DisplayASCIICharTable {

    public static void main(String[] args) {

        final int CHARACTERS_PER_LINE = 10;

        for (int i = 33; i <= 126; i++) {
            System.out.printf("%c ", i);
            if ((i - 32) % CHARACTERS_PER_LINE == 0) {
                System.out.println();
            }
        }

    }
}
