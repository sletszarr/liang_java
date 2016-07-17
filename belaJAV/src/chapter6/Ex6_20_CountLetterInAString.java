package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_20_CountLetterInAString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("You have " +
                countLetters(s) +
                ((countLetters(s) == 1) ? " letter " : " letters ") +
                "in your string.");

    }

    public static int countLetters(String s) {

        int letterCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letterCount++;
            }
        }

        return letterCount;

    }
}
