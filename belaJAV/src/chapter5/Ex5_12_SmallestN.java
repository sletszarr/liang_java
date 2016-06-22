package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_12_SmallestN {


    public static void main(String[] args) {

        final int BOUND = 12000;
        int nEstimate = 100;

        while ((nEstimate * nEstimate) < BOUND) {
            nEstimate++;
        }

        System.out.printf("The smallest n such that n^2 > 12000 is %d\n", nEstimate);

    }

}
