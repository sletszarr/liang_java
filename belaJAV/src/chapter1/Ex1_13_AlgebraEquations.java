package chapter1;

/**
 * Created by bnamora on 6/8/16.
 *
 * (Algebra: solve 2 * 2 linear equations)
 * You can use Cramer’s rule to solve the fol- lowing 2 * 2 system of linear equation:
 *
 *      ax + by = e
 *      cx + dy = f
 *
 *          ed - bf         af - ec
 *      x = -------     y = -------
 *          ad - bc         ad - bc
 *
 * Write a program that solves the following equation and displays the value for x and y :
 *      3.4x + 50.2y = 44.5
 *      2.1x + .55y = 5.9
 *
 */

public class Ex1_13_AlgebraEquations {

    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        System.out.println("3.4x + 50.25y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
        System.out.println("x = " + (e * d - b * f) / (a * d - b * c));
        System.out.println("y = " + (a * f - e * c) / (a * d - b * c));

    }
}
