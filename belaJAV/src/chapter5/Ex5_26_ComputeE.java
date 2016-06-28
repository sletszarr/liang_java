package chapter5;

import java.math.BigInteger;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_26_ComputeE {

    public static void main(String[] args) {

        double e;
        double factorial;

        System.out.println("Iterations\t\tEuler Approximate");
        for (int k = 10000; k <= 100000; k += 10000) {

            e = 1.0;
            factorial = 1.0;

            for (int l = 1; l <= k; l++) {
                factorial *= l;
                e += 1.0 / factorial;
            }

            System.out.printf("\t%6d\t\t", k);
            System.out.println(e);
        }
    }
}
