package chapter10;

import java.math.BigInteger;

/**
 * Created by bnamora on 7/28/16.
 */

public class Ex10_18_LargePrimeNumbers {

    public static void main(String[] args) {

        BigInteger num = BigInteger.valueOf(Long.MAX_VALUE);
        int count = 0;
        while (count < 10) {
            if (num.isProbablePrime(2)) {
                count++;
                System.out.println(num);
            }
            num = num.add(BigInteger.ONE);
        }

    }
}
