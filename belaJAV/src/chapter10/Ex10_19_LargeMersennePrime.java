package chapter10;

import java.math.BigInteger;

/**
 * Created by bnamora on 7/28/16.
 */

public class Ex10_19_LargeMersennePrime {

    public static void main(String[] args) {
        // initialize p
        int p = 2;

        // get mersenne prime
        // p <= 100
        while (p<=100) {
            // create BigInteger object
            // prm from p, and
            // mersenne from 2^p - 1
            BigInteger prm = new BigInteger(p + "");
            BigInteger mersenne = getMersenneNum(p);

            // check if prm and mersenne
            // is both a prime number
            if (prm.isProbablePrime(2) && mersenne.isProbablePrime(2))
                System.out.print(prm + "\t\t" + mersenne + "\n");

            // increment p
            p++;
        }
    }

    public static BigInteger getMersenneNum(int p) {
        // create BigInteger object
        // with intValue() of 2
        BigInteger two = new BigInteger("2");

        // create mersenne object
        BigInteger mersenne = two.pow(p);
        mersenne = mersenne.subtract(BigInteger.ONE);

        return mersenne;
    }
}
