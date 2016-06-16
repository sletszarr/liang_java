package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_27_PointsInTriangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double triangleX1 = 200.0;
        double triangleY1 = 0.0;
        double triangleX2 = 0.0;
        double triangleY2 = 100.0;
        double triangleX3 = 0.0;
        double triangleY3 = 0.0;

        System.out.print("Enter a point's x and y coordinates: ");
        double pointX = input.nextDouble();
        double pointY = input.nextDouble();

        double sideDeterminant = ((triangleX2 - triangleX1) * (pointY - triangleY1)) - ((pointX - triangleX1) * (triangleY2 - triangleY1));

        boolean onLeftSideOfTheSlope = (sideDeterminant > 0);

        if (onLeftSideOfTheSlope && pointX > 0 && pointY > 0) {
            System.out.println("The point is in the triangle");
        }
        else {
            System.out.println("The point is not in the triangle");
        }

    }

}
