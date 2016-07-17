package chapter4;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_6_RandomPointsOnACircle {

    public static void main(String[] args) {

        double circleRadius = 40.0;

        // generate random angle in degree
        int angleDegree1 = (int) (Math.random() * 361);
        int angleDegree2 = (int) (Math.random() * 361);
        int angleDegree3 = (int) (Math.random() * 361);

        // change it to radian
        double angleRadian1 = Math.toRadians(angleDegree1);
        double angleRadian2 = Math.toRadians(angleDegree2);
        double angleRadian3 = Math.toRadians(angleDegree3);

        // random point
        double x1 = circleRadius * Math.cos(angleRadian1);
        double y1 = circleRadius * Math.sin(angleRadian1);
        double x2 = circleRadius * Math.cos(angleRadian2);
        double y2 = circleRadius * Math.sin(angleRadian2);
        double x3 = circleRadius * Math.cos(angleRadian3);
        double y3 = circleRadius * Math.sin(angleRadian3);

        // display formatted result
        System.out.printf("The first random point from %d degree is (%4.2f, %4.2f)\n", angleDegree1, x1, y1);
        System.out.printf("The second random point from %d degree is (%4.2f, %4.2f)\n", angleDegree2, x2, y2);
        System.out.printf("The third random point from %d degree is (%4.2f, %4.2f)\n", angleDegree3, x3, y3);

    }

}
