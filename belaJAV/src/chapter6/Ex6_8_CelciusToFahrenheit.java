package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_8_CelciusToFahrenheit {

    public static void main(String[] args) {

        // display header
        System.out.println(" Celcius\t\tFahrenheit\t|\tFahrenheit\tCelcius");

        // display table body
        for (double celcius = 40.0, fahrenheit = 120.0;
             celcius > 30; celcius--, fahrenheit -= 10) {

            System.out.printf("\t%.1f\t\t%.1f\t\t|\t%.1f\t\t%.2f\n",
                    celcius, celciusToFahrenheit(celcius),
                    fahrenheit, fahrenheitToCelcius(fahrenheit));

        }

    }

    public static double celciusToFahrenheit(double celcius) {

        return (9.0 / 5) * celcius + 32;

    }

    public static double fahrenheitToCelcius(double fahrenheit) {

        return (5.0 / 9) * (fahrenheit - 32);

    }
}
