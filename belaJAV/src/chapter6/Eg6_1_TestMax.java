package chapter6;

/**
 * Created by bnamora on 6/29/16.
 */

public class Eg6_1_TestMax {

    public static void main(String[] args) {

        int i = 5;
        int j = 2;
        int k = max(i, j);

        System.out.println("The maximum of " +
                i + " and " + j + " is " + k);

    }

    public static int max(int num1, int num2) {

        int result = (num1 > num2) ? num1 : num2;

        return result;
    }
}
