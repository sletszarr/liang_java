package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_6_TestDoWhile {

    public static void main(String[] args) {

        int data;
        int sum = 0;

        // create scanner
        Scanner input = new Scanner(System.in);

        // keep reading data until the input is 0
        do {
            System.out.print("Enter an integer" +
                    "(the input ends if it is 0): ");
            data = input.nextInt();

            sum += data;
        } while (data != 0);

        System.out.println("The sum is " + sum);
    }
}
