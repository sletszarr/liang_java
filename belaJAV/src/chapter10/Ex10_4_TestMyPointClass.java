package chapter10;

import mylib.MyPoint;

/**
 * Created by bnamora on 7/24/16.
 */

public class Ex10_4_TestMyPointClass {

    public static void main(String[] args) {

        MyPoint a = new MyPoint();
        MyPoint b = new MyPoint(10, 30.5);

        System.out.printf("The distance between " +
                        "(%.1f, %.1f) and (%.1f, %.1f) is %.2f",
                a.x, a.y, b.x, b.y,
                a.distance(b));

    }
}
