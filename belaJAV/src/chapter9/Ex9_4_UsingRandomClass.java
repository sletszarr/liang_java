package chapter9;

import java.util.Random;

/**
 * Created by bnamora on 7/21/16.
 */

public class Ex9_4_UsingRandomClass {

    public static void main(String[] args) {

        // create random object
        Random rand = new Random(1000);

        // display 50 randoms
        for (int i = 0; i < 50; i++) {
            System.out.printf("%-2d ", rand.nextInt(100));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

    }
}
