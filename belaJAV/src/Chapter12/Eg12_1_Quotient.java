package Chapter12;

import java.util.Scanner;

/**
 * Created by bnamora on 1/21/17.
 */

public class Eg12_1_Quotient {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user to enter 2 integers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        // print division on console
        System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));

    }
}
