package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */
public class eg24_computeAreaWithConstant {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("input a circle's radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * PI;

        System.out.println("A circle's area with " + radius + " radius is " + area);

    }
}
