package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */

public class Eg2_6_FahrenheitToCelcius {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("input a degree in fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celcius = 5.0 / 9 * (fahrenheit - 32);
        System.out.println(fahrenheit + " fahrenheit is " + celcius + " celcius");

    }
}
