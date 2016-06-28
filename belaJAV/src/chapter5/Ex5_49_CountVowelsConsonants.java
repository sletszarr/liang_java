package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/29/16.
 */

public class Ex5_49_CountVowelsConsonants {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get string from user
        System.out.print("Enter a string: ");
        String aString = input.nextLine();

        // define vowels
        String vowels = "aiueoAIUEO";

        // initialize counter
        int vowelCount = 0;
        int consonantCount = 0;

        // count vowels
        for (int i = 0; i < aString.length(); i++) {
            if (Character.isLetter(aString.charAt(i))) {
                if (vowels.contains(Character.toString(aString.charAt(i)))) {
                    vowelCount++;
                }
                else {
                    consonantCount++;
                }
            }
        }

        // display result
        System.out.println("The number of vowels is "+vowelCount);
        System.out.println("The number of consonant is " + consonantCount);

    }
}
