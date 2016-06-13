package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */
public class Ex21_CelciusToFahrenheit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in Celcius: ");
        double celciusDeg = input.nextDouble();

        double fahrenheitDeg = (9.0 / 5) * celciusDeg + 32;
        System.out.println(celciusDeg+" Celcius is "+fahrenheitDeg+" Fahrenheit");

    }
}
