package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_15_PhoneKeyPads {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letterString = input.nextLine();

        if (letterString.length() == 1) {
            char letter = letterString.charAt(0);
            int correspondingNum = 0;

            if (Character.toUpperCase(letter) >= 'A' && Character.toUpperCase(letter) <= 'C') {
                correspondingNum = 2;
            }
            else if (Character.toUpperCase(letter) >= 'D' && Character.toUpperCase(letter) <= 'F') {
                correspondingNum = 3;
            }
            else if (Character.toUpperCase(letter) >= 'G' && Character.toUpperCase(letter) <= 'I') {
                correspondingNum = 4;
            }
            else if (Character.toUpperCase(letter) >= 'J' && Character.toUpperCase(letter)<= 'L') {
                correspondingNum = 5;
            }
            else if (Character.toUpperCase(letter) >= 'M' && Character.toUpperCase(letter) <= 'O') {
                correspondingNum = 6;
            }
            else if (Character.toUpperCase(letter) >= 'P' && Character.toUpperCase(letter) <= 'S') {
                correspondingNum = 7;
            }
            else if (Character.toUpperCase(letter) >= 'T' && Character.toUpperCase(letter) <= 'V') {
                correspondingNum = 8;
            }
            else if (Character.toUpperCase(letter) >= 'W' && Character.toUpperCase(letter) <= 'Z') {
                correspondingNum = 9;
            }
            else {
                System.out.println(letter+" is an invalid input");
                System.exit(1);
            }
            System.out.println("The corresponding number is " + correspondingNum);
        }
        else {
            System.out.println("You can only enter 1 character");
            System.exit(1);
        }
    }
}
