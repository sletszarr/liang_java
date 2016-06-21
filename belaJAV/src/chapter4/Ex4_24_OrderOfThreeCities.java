package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Ex4_24_OrderOfThreeCities {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city: ");
        String firstCity = input.nextLine();

        System.out.print("Enter the second city: ");
        String secondCity = input.nextLine();

        System.out.print("Enter the third city: ");
        String thirdCity = input.nextLine();

        if (firstCity.compareTo(secondCity) > 0) {
            String temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }
        if (secondCity.compareTo(thirdCity) > 0) {
            String temp = secondCity;
            secondCity = thirdCity;
            thirdCity = temp;
        }
        if (firstCity.compareTo(secondCity) > 0) {
            String temp = firstCity;
            firstCity = secondCity;
            secondCity = temp;
        }

        System.out.printf("The three cities in alphabetical order are %s %s %s", firstCity, secondCity, thirdCity);

    }
}
