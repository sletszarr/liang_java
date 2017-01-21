package Chapter12;

import java.util.Scanner;

/**
 * Created by bnamora on 1/21/17.
 */

public class Eg12_3_QuotientWithMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // get quotient
        int result = quotient(num1, num2);

        // print to console
        System.out.println(num1 + " / " + num2 + " is " + result);
    }

    public static int quotient(int num1, int num2) {

        if (num2 == 0) {
            System.out.println("Divisor can not be zero");
            System.exit(1);
        }

        return num2 / num1;
    }

}
