package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_3_SolvingTwoByTwoLinearEq {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        System.out.println("\nHere's your equation: ");
        System.out.println(a + "x + " + b + "y = " + e);
        System.out.println(c + "x + " + d + "y = " + f);

        boolean hasSolution = ((a * d - b * c) != 0);

        if (hasSolution) {
            System.out.println("\nx = " + (e * d - b * f) / (a * d - b * c));
            System.out.println("y = " + (a * f - e * c) / (a * d - b * c));
        }
        else {
            System.out.println("\nThe equation above has no solution");
        }

    }
}
