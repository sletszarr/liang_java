package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/19/16.
 */

public class Ex4_2_GreatCircleDistance {

    public static void main(String[] args) {

        double earthRadius = 6371.01;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        double distance = earthRadius
                * Math.acos(Math.sin(x1) * Math.sin(x2) +
                            Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

        System.out.println("The distance between two points is " + distance + " km");
    }
}
