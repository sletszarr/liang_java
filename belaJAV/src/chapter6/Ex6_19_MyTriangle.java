package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_19_MyTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 sides of the triangle: ");
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        if (isValidTriangle(side1, side2, side3)) {
            System.out.println("The area of the triangle is " +
                    area(side1, side2, side3));
        }
        else {
            System.out.println("That's not a valid triangle");
        }


    }

    public static boolean isValidTriangle(
            double side1, double side2, double side3) {
        boolean isValid ;

        if ((side1 + side2) <= side3) {
            return false;
        }
        if ((side2 + side3) <= side1) {
            return false;
        }
        if ((side1 + side3) <= side2) {
            return false;
        }

        return true;

    }

    public static double area(
            double side1, double side2, double side3) {

        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(2 * s *
                        (s - side1) *
                        (s - side2) *
                        (s - side3)
        );

        return area;

    }
}
