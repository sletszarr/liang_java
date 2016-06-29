package chapter6;

/**
 * Created by bnamora on 6/29/16.
 */

public class Eg6_9_TestMethodOverloading {

    public static void main(String[] args) {

        System.out.println("The maximum of 3 and 4 is " +
                max(3, 4));

        System.out.println("The maximum of 3.0 and 5.4 is " +
                max(3.0, 5.4));

        System.out.println("The maximum of 3.0, 5.4 and 10.54 is " +
                max(3.0, 5.4, 10.54));

    }

    public static int max(int num1, int num2) {

        return (num1 > num2) ? num1 : num2;

    }

    public static double max(double num1, double num2) {

        return (num1 > num2) ? num1 : num2;

    }

    public static double max(double num1, double num2, double num3) {

        return max(max(num1, num2), num3);
    }

}
