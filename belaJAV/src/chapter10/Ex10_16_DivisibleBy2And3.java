package chapter10;

import java.math.BigInteger;

/**
 * Created by bnamora on 7/28/16.
 */
public class Ex10_16_DivisibleBy2And3 {

    public static void main(String[] args) {

        String num= "1";
        for (int i = 1; i < 50; i++)
            num += "0";

        BigInteger bigNum = new BigInteger(num);
        BigInteger a = new BigInteger("2");
        BigInteger b = new BigInteger("3");

        int count = 0;
        while (count < 11) {
            if (bigNum.remainder(a).equals(BigInteger.ZERO) ||
                    bigNum.remainder(b).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                count++;
            }
            bigNum = bigNum.add(BigInteger.ONE);
        }
    }
}
