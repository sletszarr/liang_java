package chapter6;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/2/2016.
 */

public class Ex6_36_AreaOfARegularPolygon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        double nSide = input.nextDouble();

        System.out.print("Enter the side: ");
        double sideLength = input.nextDouble();

        System.out.println("The area of the polygon is " +
                area(nSide, sideLength));

    }

    public static double area(double n, double side) {
        return n * side * side / (4 * Math.tan(Math.PI / n));
    }

}
