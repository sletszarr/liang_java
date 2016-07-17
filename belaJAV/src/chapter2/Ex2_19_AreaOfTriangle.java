package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/14/16.
 *
 * (Geometry: area of a triangle)
 * Write a program that prompts the user to enter three points
 *      (x1, y1), (x2, y2), (x3, y3)
 *
 * of a triangle and displays its area.
 *
 * The formula for computing the area of a triangle is
 *      s = (side1 + side2 + side3)/2;
 *      area = [2s(s - side1)(s - side2)(s - side3)]^0.5
 *
 */

public class Ex2_19_AreaOfTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();


        //we'll refactor this after learning about method
        double diffXSide1Square = Math.pow(x2 - x1, 2);
        double diffYSide1Square = Math.pow(y2 - y1, 2);
        double side1 = Math.pow(diffXSide1Square + diffYSide1Square, 0.5);

        double diffXSide2Square = Math.pow(x3 - x2, 2);
        double diffYSide2Square = Math.pow(y3 - y2, 2);
        double side2 = Math.pow(diffXSide2Square + diffYSide2Square, 0.5);

        double diffXSide3Square = Math.pow(x3 - x1, 2);
        double diffYSide3Square = Math.pow(y1 - y1, 2);
        double side3 = Math.pow(diffXSide3Square + diffYSide3Square, 0.5);
        //

        double sVal = (side1 + side2 + side3) / 2;
        double triangleArea = sVal * (sVal - side1) * (sVal - side2) * (sVal - side3);
        triangleArea = Math.pow(triangleArea, 0.5);

        System.out.println("The area of the triangle is " + triangleArea);

    }
}
