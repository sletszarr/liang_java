package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_38_DecimalToOctal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        String octal = "";

        while (decimal > 0) {
            octal = (decimal % 8) + octal;
            decimal /= 8;
        }

        System.out.println("The octal value is : " + octal);

    }
}
