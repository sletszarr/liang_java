package Chapter11;

import mylib.GeometricObject;
import mylib.Triangle;

import java.util.Scanner;

/**
 * Created by bnamora on 10/17/16.
 */

public class Ex11_1_TheTriangleClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 3 sides of the triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.print("Enter the color: ");
        String color = input.next();

        System.out.print("Will the triangle be filled? [true|false] ");
        boolean filled = input.nextBoolean();

        Triangle segitiga = new Triangle(s1, s2, s3, color, filled);

        System.out.println(segitiga.toString());;
        System.out.println("The triangle has the color of " + segitiga.getColor() +
                " and the area is " + ((segitiga.isFilled()) ? "" : "not") + "filled");

    }

}
