package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */

public class Ex29_Acceleration {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1, and t: ");
        double v0Val = input.nextDouble();
        double v1Val = input.nextDouble();
        double tVal = input.nextDouble();

        double accelaration = (v1Val - v0Val) / tVal;
        System.out.println("The average acceleration is " + accelaration);

    }
}
