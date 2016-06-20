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
        char letter = input.nextLine().charAt(0);

        // check if it's a vowel or a consonant
        if (Character.toLowerCase(letter) == 'a'
                || Character.toLowerCase(letter) == 'i'
                || Character.toLowerCase(letter) == 'u'
                || Character.toLowerCase(letter) == 'e'
                || Character.toLowerCase(letter) == 'o') {
            System.out.println(letter+" is a vowel");
        }
        else if (Character.isLetter(letter)) {
            System.out.println(letter+" is a consonant");
        }
        else {
            System.out.println(letter+" is an invalid input");
        }

    }

}
