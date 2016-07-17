package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_9_FindUnicodeFromChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user to
        System.out.print("Enter a character: ");
        char inputChar = input.nextLine().charAt(0);

        int uniCode = (int) inputChar;

        System.out.printf("The Unicode for the character %c is %d", inputChar, uniCode);

    }

}
