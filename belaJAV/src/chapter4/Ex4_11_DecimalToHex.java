package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_11_DecimalToHex {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalVal = input.nextInt();

        if (decimalVal >= 0 && decimalVal <= 9) {
            System.out.printf("The hex value is %d", decimalVal);
        }
        else if (decimalVal > 9 && decimalVal <= 15) {
            char hexVal = (char) (decimalVal + 55);
            System.out.printf("The hex value is %c", hexVal);
        }
        else {
            System.out.printf("%d is an invalid input", decimalVal);
        }

    }

}
