package Chapter12;

import java.util.Scanner;

/**
 * Created by bnamora on 1/21/17.
 */

public class Eg12_2_QuotientWithIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get numbers
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the first number: ");
        int num2 = input.nextInt();

        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " is " + (num1 / num2));
        }
        else {
            System.out.println("Divisor can't be zero");
        }
    }
}
