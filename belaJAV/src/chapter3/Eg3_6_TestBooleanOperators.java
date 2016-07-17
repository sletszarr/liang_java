package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Eg3_6_TestBooleanOperators {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask for input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0) {
            System.out.println(number+" is divisible by 2 and 3");
        }

        if (number % 2 == 0 || number % 3 == 0) {
            System.out.println(number+" is divisible by 2 or 3");
        }

        if (number % 2 == 0 ^ number % 3 == 0) {
            System.out.println(number+" is divisible by 2 or 3, but not both");
        }

    }

}
