package Chapter12;

import java.util.Scanner;

/**
 * Created by bnamora on 1/21/17.
 */

public class Eg12_4_QuotientWithException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // get quotient
        try {
            int result = quotient(num1, num2);
            System.out.println(num1 + " / " + num2 + " is " + result);
        } catch (ArithmeticException ex) {
            System.out.println("Exception: an integer can not" +
                    "be divided by zero");
        }
    }

    public static int quotient(int num1, int num2) {

        if (num2 == 0) {
            throw new ArithmeticException();
        }

        return num1 / num2;
    }
}
