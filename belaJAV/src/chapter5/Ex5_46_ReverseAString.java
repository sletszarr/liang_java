package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/29/16.
 */

public class Ex5_46_ReverseAString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get string to reverse
        System.out.print("Enter a string: ");
        String aString = input.nextLine();

        // prepare variable to hold reversed string
        String reversed = "";

        // reverse string from user
        for (int i = aString.length() - 1; i >= 0; i--) {
            reversed += aString.charAt(i);
        }

        // display result
        System.out.println("The reversed string is " + reversed);

    }
}
