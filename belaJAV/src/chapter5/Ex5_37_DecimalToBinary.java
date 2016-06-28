package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_37_DecimalToBinary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get decimal
        System.out.print("Enter a decimal integer: ");
        int decimal = input.nextInt();

        // prepare binary string holder
        String binary = "";

        // convert decimal to binary
        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal /= 2;
        }

        // display result
        System.out.print("The binary is "+binary);

    }
}
