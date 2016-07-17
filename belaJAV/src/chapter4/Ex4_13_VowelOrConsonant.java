package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_13_VowelOrConsonant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user to input a char
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        char ch = letter.charAt(0);

        if (letter.length() == 1 && Character.isLetter(ch)) {

            String vowel = "aiueoAIUEO";

            // check if it's a vowel or a consonant
            if (vowel.indexOf(ch) > 0) {
                System.out.println(letter + " is a vowel");
            } else if (vowel.indexOf(ch) < 0) {
                System.out.println(letter + " is a consonant");
            }

        }
        else {
            System.out.println("You can only input 1 character of a valid letter");
        }

    }

}
