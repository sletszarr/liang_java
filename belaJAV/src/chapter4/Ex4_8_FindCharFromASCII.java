package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_8_FindCharFromASCII {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user to get ASCII code
        System.out.print("Enter an ASCII code: ");
        int codeASCII = input.nextInt();

        // convert ASCII code to char
        char charASCII = (char) codeASCII;

        // display result
        System.out.printf("The character for ASCII code %d is %c\n", codeASCII, charASCII);

    }

}
