package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/19/16.
 */

public class Ex8_30_SolveLinearEquation {

    public static void main(String[] args) {

        // get equation
        double[][] a = getA();
        double[] b = getB();

        // display equation
        displayEquation(a, b);

        // display roots
        if (linearEquation(a,b) == null) {
            System.out.println("The equation has no solution");
        } else {
            System.out.printf("x is %.1f and y is %.1f",
                    linearEquation(a, b)[0],
                    linearEquation(a, b)[1]);
        }

    }

    public static double[][] getA() {
        Scanner input = new Scanner(System.in);

        double[][] a = new double[2][2];

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                System.out.printf("Enter a[%d][%d]: ",
                        row, col);
                a[row][col] = input.nextDouble();
            }
        }

        return a;
    }

    public static double[] getB() {

        Scanner input = new Scanner(System.in);

        double[] b = new double[2];

        for (int i = 0; i < b.length; i++) {
            System.out.printf("Enter b[%d]: ", i);
            b[i] = input.nextDouble();
        }

        return b;
    }

    public static void displayEquation(double[][] a, double[] b) {
        System.out.printf("\n%.1fx + %.1fx = %.1f\n",
                a[0][0], a[0][1], b[0]);
        System.out.printf("%.1fx + %.1fx = %.1f\n",
                a[1][0], a[1][1], b[1]);
        System.out.println();
    }

    public static double[] linearEquation(double[][] a, double[] b) {

        // calculate determinant
        double determinant = a[0][0] * a[1][1] - a[0][1] * a[1][0];

        // return null for no roots
        if (determinant == 0) {
            return null;
        }

        // prepare root
        double[] roots = new double[2];

        // calculate x
        roots[0] = (b[0] * a[1][1] - b[1] * a[0][1]) / determinant;

        // calculate y
        roots[1] = (b[1] * a[0][0] - b[0] * a[1][0]) / determinant;

        return roots;
    }
}
