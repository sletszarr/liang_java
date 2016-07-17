package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_5_SentinelValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // read initial data
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        // keepr eading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;

            // read the next data
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }

        System.out.println("The sum is " + sum);
    }
}
