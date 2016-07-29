package chapter10;

import java.math.BigInteger;

/**
 * Created by bnamora on 7/29/16.
 */

public class Ex10_21_DivisibleBy5Or6 {

    public static void main(String[] args) {

        BigInteger num = BigInteger.valueOf(Long.MAX_VALUE).add(BigInteger.ONE);
        int counter = 0;

        while (counter < 11) {
            if (num.remainder(new BigInteger("5")).equals(BigInteger.ZERO) ||
                    num.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
                System.out.println(num);
                counter++;
            }
            num = num.add(BigInteger.ONE);
        }

    }
}
