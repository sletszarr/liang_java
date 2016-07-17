package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_1_SolvingQuadraticEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        System.out.println(a + "x^2 + " + b + "x + " + c);

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        if (discriminant > 0) {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

            System.out.println("The equation has two roots " + r1 + " and " + r2);

        }
        else if (discriminant == 0) {
            double r = -b / (2 * a);

            System.out.println("The equation has one root " + r);

        }

        else if (discriminant < 0) {
            System.out.println("The equation has no real roots");

        }

    }
}
