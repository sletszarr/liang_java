package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_44_BitLevelOperations {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short decimal = input.nextShort();

        String binary = "";

        for (int i = 0; i < 16; i++) {
            binary = (decimal & 1) + binary;
            decimal >>= 1;
        }

        System.out.println(binary);

    }
}
