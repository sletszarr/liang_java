package chapter9.Ex9_11_LinearEquation;

import java.util.Scanner;

/**
 * Created by bnamora on 7/22/16.
 */

public class TestLinearEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get equation
        double userEqn[] = new double[6];
        System.out.print("Enter a, b, c, d, e, f: ");
        for (int i = 0; i < userEqn.length; i++) {
            userEqn[i] = input.nextDouble();
        }

        // create linear eqn object
        LinearEquation eqn = new LinearEquation(userEqn);

        // display solution
        if (eqn.isSolvable()) {
            System.out.println("x is " + eqn.getX() + " and y is " +
                    eqn.getY());
        } else {
            System.out.println("The equation has no solution");
        }

    }
}
