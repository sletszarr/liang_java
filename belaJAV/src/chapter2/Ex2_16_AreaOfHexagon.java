package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
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
