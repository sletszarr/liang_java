package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/29/16.
 */

public class Ex5_48_ProcessString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get string from user
        System.out.print("Enter a string: ");
        String aString = input.nextLine();

        // print characters at odd position
        for (int i = 0; i < aString.length(); i++) {
            System.out.printf(((i + 1) % 2 == 1) ?
                    Character.toString(aString.charAt(i)) : "");
        }

    }
}
