package chapter10.Ex10_4_MyPointClass;

/**
 * Created by bnamora on 7/24/16.
 */

public class TestMyPoint {

    public static void main(String[] args) {

        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(10, 30.5);

        System.out.printf("The distance between " +
                        "(%.1f, %.1f) and (%.1f, %.1f) is %.2f",
                a.getX(), a.getY(), b.getX(), b.getY(),
                a.distance(b));

    }
}
