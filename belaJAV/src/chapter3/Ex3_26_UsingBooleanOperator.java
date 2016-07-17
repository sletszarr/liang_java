package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_26_UsingBooleanOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.println("is " + num + "is divisible by 5 and 6? " + (num % 5 == 0 && num % 6 == 0));
        System.out.println("is " + num + "is divisible by 5 or 6? " + (num % 5 == 0 || num % 6 == 0));
        System.out.println("is " + num + "is divisible by 5 and 6, but not both? " + (num % 5 == 0 ^ num % 6 == 0));

    }
}
