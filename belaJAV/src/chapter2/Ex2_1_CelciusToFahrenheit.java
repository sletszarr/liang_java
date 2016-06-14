package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Convert Celsius to Fahrenheit)
 * Write a program that reads a Celsius degree in a double value from the console,
 * then converts it to Fahrenheit and displays the result.
 *
 * The formula for the conversion is as follows:
 *      fahrenheit = (9 / 5) * celsius + 32
 *
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 *
 */

public class Ex2_1_CelciusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celcius: ");
        double celciusDeg = input.nextDouble();

        double fahrenheitDeg = (9.0 / 5) * celciusDeg + 32;
        System.out.println(celciusDeg+" Celcius is "+fahrenheitDeg+" Fahrenheit");

    }
}
