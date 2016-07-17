package chapter6;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/2/2016.
 */

public class Ex6_35_AreaOfPentagon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        System.out.println("The area of the pentagon is " +
                area(side));

    }

    public static double area(double side) {
        return  5 * side * side / (4 * Math.tan(Math.PI / 5));
    }
}
