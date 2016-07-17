package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Convert pounds into kilograms)
 * Write a program that converts pounds into kilo- grams.
 * The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result.
 * One pound is 0.454 kilograms.
 *
 */

public class Ex2_4_PoundsToKg {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number in pounds: ");
        double poundVal = input.nextDouble();

        double kgVal = poundVal * 0.454;
        System.out.println(poundVal + " pounds is " + kgVal + " kilograms");

    }
}
