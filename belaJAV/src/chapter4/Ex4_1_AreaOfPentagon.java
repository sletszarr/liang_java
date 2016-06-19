package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/19/16.
 */

public class Ex4_1_AreaOfPentagon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user to input radius
        System.out.print("Enter the length from the center to a vertex: ");
        double pentagonRadius = input.nextDouble();

        // Compute pentagon's side and area
        double pentagonSide = 2 * pentagonRadius * Math.sin(Math.PI / 5);
        double pentagonArea = 5 * pentagonSide * pentagonSide / (4 * Math.tan(Math.PI / 5));

        // Display result
        System.out.println("The area of the pentagon is " + Math.round(pentagonArea * 100) / 100.0);
    }
}
