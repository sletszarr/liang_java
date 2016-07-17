package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/29/16.
 */

public class Ex5_50_CountUppercaseLetters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get string from user
        System.out.print("Enter a string: ");
        String aString = input.nextLine();

        // initialize counter
        int upperCaseCount = 0;

        // count uppercase letter
        for (int i = 0; i < aString.length(); i++) {
            upperCaseCount = (aString.charAt(i) >= 65
                    && aString.charAt(i) <= 90)
                    ? upperCaseCount + 1 : upperCaseCount;
        }

        // display result
        System.out.println("The number of uppercase letters is " + upperCaseCount);

    }
}
