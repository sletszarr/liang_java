package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/7/2016.
 */

public class Ex7_25_SolveQuadraticEqn {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] eqn = new double[3];
        double[] roots = new double[2];
        int numOfRoots;

        // get equation
        // a is stored in eqn[0]
        // b is stored in eqn[1]
        // c is stored in eqn[2]
        System.out.print("Enter a, b, c: ");
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }

        // solve the equation
        numOfRoots = solveQuadratic(eqn, roots);

        // display result
        if (numOfRoots == 2) {
            System.out.printf("The equation has two roots %f and %f\n",
                    roots[0], roots[1]);
        } else if (numOfRoots == 1) {
            System.out.printf("The equation has one root %f\n", roots[0]);
        } else {
            System.out.printf("The equation has no real root");
        }

    }

    public static int solveQuadratic(double[] eqn, double[] roots) {

        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];

        double discriminant = b * b - 4 * a * c;

        if (discriminant == 0) {
            roots[0] = -b / (2 * a);
            return 1;
        }
        else if (discriminant > 0) {
            roots[0] = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            roots[1] = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            return 2;
        }
        else {
            return -1;
        }
    }

}
