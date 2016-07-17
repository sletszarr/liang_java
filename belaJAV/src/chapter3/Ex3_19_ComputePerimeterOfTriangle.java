package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_19_ComputePerimeterOfTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of each triangle's edge: ");
        double edge1 = input.nextDouble();
        double edge2 = input.nextDouble();
        double edge3 = input.nextDouble();

        boolean isValidTriangle = ((edge1 + edge2) > edge3 && (edge1 + edge3) > edge2 && (edge2 + edge3) > edge1);

        if (isValidTriangle) {
            double perimeter = edge1 + edge2 + edge3;
            System.out.println("The perimeter is " + perimeter);
        }
        else {
            System.out.println("That is not a triangle");
        }

    }

}
