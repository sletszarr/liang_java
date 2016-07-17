package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */
public class Ex5_13_LargestN {

    public static void main(String[] args) {

        final int BOUND = 12000;
        int nEstimate = 10;

        while ((nEstimate * nEstimate * nEstimate) < 12000) {
            nEstimate++;
        }

        System.out.printf("The largest n such that n^3 < 12000 is %d\n", nEstimate - 1);

    }
}
