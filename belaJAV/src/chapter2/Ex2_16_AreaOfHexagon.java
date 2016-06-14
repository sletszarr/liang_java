package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * (Geometry: area of a hexagon)
 * Write a program that prompts the user to enter the side of a hexagon and displays its area.
 * The formula for computing the area of a hexagon is
 *
 *             3*3^0.5
 *      Area = ------- s^2
 *                2
 *
 * where s is the length of a side.
 *
 */

public class Ex2_16_AreaOfHexagon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double sideLength = input.nextDouble();

        double hexagonArea = (3 * Math.pow(3, 0.5) * Math.pow(sideLength, 2)) / 2;

        System.out.println("The area of the hexagon is " + hexagonArea);

    }
}
