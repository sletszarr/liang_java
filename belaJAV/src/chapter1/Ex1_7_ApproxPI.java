package chapter1;

/**
 * Created by bnamora on 6/7/16.
 *
 * (Approximate π)
 * π can be computed using the following formula:
 *
 *                       1     1     1     1     1
 *      π = 4 x (  1  -  -  +  -  -  -  +  -  -  -  + ...  )
 *                       3     5     7     9     11
 *
 * Write a program that displays the result of
 *                       1     1     1     1     1     1
 *          4 x (  1  -  -  +  -  -  -  +  -  -  -  +  -  )
 *                       3     5     7     9     11    13
 *
 */

public class Ex1_7_ApproxPI {

    public static void main(String[] args) {

        System.out.println("             1     1     1     1     1     1");
        System.out.println("4 x (  1  -  -  +  -  -  -  +  -  -  -  +  -  ) = " + (4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13)));
        System.out.println("             3     5     7     9     11    13");

    }
}
