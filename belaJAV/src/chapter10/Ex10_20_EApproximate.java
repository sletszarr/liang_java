package chapter10;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by bnamora on 7/29/16.
 */

public class Ex10_20_EApproximate {

    public static void main(String[] args) {

        for (int i = 10000; i <= 100000; i += 10000) {
            BigDecimal e = new BigDecimal(2);
            BigInteger factorial = BigInteger.ONE;
            for (int k = 2; k <= i; k++) {
                factorial = factorial.multiply(new BigInteger(k + ""));
                e = e.add(BigDecimal.ONE.divide(
                        new BigDecimal(factorial), 25, BigDecimal.ROUND_DOWN));
            }
            System.out.println(e);
        }
    }

}
