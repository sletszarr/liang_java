package chapter10;

import java.math.BigInteger;

/**
 * Created by bnamora on 7/28/16.
 */

public class Ex10_17_SquareNumbers {

    public static void main(String[] args) {

        long initialRoot =
                getTheFirstRootOfSquareNumAfter(Long.MAX_VALUE);

        BigInteger root = BigInteger.valueOf(initialRoot);

        for (int i = 0; i < 10; i++) {
            System.out.println(root.multiply(root));
            root = root.add(BigInteger.ONE);
        }

    }

    public static long getTheFirstRootOfSquareNumAfter(long maxLong) {
        long root = 3000000000L;
        while ((root * root) > 0)
            root++;
        return root;
    }

}
