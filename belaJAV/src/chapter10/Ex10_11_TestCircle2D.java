package chapter10;

import mylib.Circle2D;

/**
 * Created by bnamora on 7/25/16.
 */

public class Ex10_11_TestCircle2D {

    public static void main(String[] args) {
        // create c1 object
        Circle2D c1 = new Circle2D(2, 2, 5.5);

        // test contains and overlaps
        System.out.println(c1.contains(3, 3));
        System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));

    }
}
