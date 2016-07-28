package chapter10;

import mylib.MyRectangle2D;

import java.util.Scanner;

/**
 * Created by bnamora on 7/28/16.
 */

public class Ex10_15_GetBoundingRectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[][] points = new double[5][2];
        System.out.print("Enter five points: ");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        MyRectangle2D boundingRect = MyRectangle2D.getRectangle(points);

        System.out.print("The bounding rectangle's center ");
        System.out.printf("(%.2f, %.2f), ",
                boundingRect.getCx(),
                boundingRect.getCy());
        System.out.printf("width %.1f, height %.1f",
                boundingRect.getWidth(),
                boundingRect.getHeight());

    }
}
