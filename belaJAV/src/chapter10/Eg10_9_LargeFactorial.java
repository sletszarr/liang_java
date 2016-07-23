package chapter10;

import java.math.BigInteger;

/**
 * Created by bnamora on 7/23/16.
 */

public class Eg10_9_LargeFactorial {

    public static void main(String[] args) {

        System.out.println("10000! is \n" + getFactorial(100000));
    }

    public static BigInteger getFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}

