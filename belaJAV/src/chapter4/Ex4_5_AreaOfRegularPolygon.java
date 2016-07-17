package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_5_AreaOfRegularPolygon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user to get polygon sides and its length
        System.out.print("Enter the number of sides: ");
        int numOfSides = input.nextInt();

        System.out.print("Enter the side: ");
        double sideLength = input.nextDouble();

        // calculating polygon's area
        double polygonArea = numOfSides * sideLength * sideLength / (4 * Math.tan(Math.PI / numOfSides));

        System.out.println("The area of the polygon is " + Math.round(polygonArea * 100) / 100.0);

    }
}
