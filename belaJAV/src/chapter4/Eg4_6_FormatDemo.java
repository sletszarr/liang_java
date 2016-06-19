package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/19/16.
 */

public class Eg4_6_FormatDemo {

    public static void main(String[] args) {

        // Display the header of the table
        System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians",
                "Sine", "Cosine", "Tangent");

        // Display the value for 30 degrees
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians,
                Math.sin(radians), Math.cos(radians), Math.tan(radians));

        degrees = 60;
        radians = Math.toRadians(degrees);
        System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f", degrees, radians,
                Math.sin(radians), Math.cos(radians), Math.tan(radians));

    }

}
