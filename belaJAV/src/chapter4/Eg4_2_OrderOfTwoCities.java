package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/19/16.
 */

public class Eg4_2_OrderOfTwoCities {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two cities
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("The cities in an alphabetical order are " +
                            city1 + " " + city2
            );
        }
        else {
            System.out.println("The cities in an alphabetical order are " +
                            city2 + " " + city1
            );
        }

    }

}
