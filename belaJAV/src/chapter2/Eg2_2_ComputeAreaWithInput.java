package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */
public class Eg2_2_ComputeAreaWithInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the circle's radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * Math.PI;

        System.out.println("A circle's area with " + radius + " radius is " + area);

    }
}
