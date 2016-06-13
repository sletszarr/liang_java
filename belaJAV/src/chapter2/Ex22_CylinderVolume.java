package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */
public class Ex22_CylinderVolume {

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
