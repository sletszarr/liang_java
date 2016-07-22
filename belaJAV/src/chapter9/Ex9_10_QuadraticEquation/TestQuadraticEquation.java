package chapter9.Ex9_10_QuadraticEquation;

import java.util.Scanner;

/**
 * Created by bnamora on 7/22/16.
 */

public class TestQuadraticEquation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get coefficients
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // create quadratic eqn object
        QuadraticEquation eqn = new QuadraticEquation(a, b, c);

        // display root
        if (eqn.getDiscriminant() > 0) {
            System.out.println("The equation has 2 roots " +
                    eqn.getRoot1() + " and " + eqn.getRoot2());
        } else if (eqn.getDiscriminant() == 0) {
            System.out.println("The equation has one root " +
                    eqn.getRoot1());
        } else {
            System.out.println("The equation has no real root");
        }

    }
}