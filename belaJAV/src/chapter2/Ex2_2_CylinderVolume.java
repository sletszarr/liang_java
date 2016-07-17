package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 *
 * (Compute the volume of a cylinder)
 * Write a program that reads in the radius and length of a cylinder and
 * computes the area and volume using the following formulas:
 *      area = radius * radius * p
 *      volume = area * length
 *
 */

public class Ex2_2_CylinderVolume {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder: ");
        double cylinderRadius = input.nextDouble();
        double cylinderLength = input.nextDouble();

        double cylinderArea = cylinderRadius * cylinderRadius * Math.PI;
        double cylinderVolume = cylinderArea * cylinderLength;

        System.out.println("The area is " + cylinderArea);
        System.out.println("The volume is " + cylinderVolume);

    }
}
