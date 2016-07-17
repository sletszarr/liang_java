package chapter5;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_40_SimmulateHeadTail {

    public static void main(String[] args) {

        int flip = 0;
        int headCount = 0;
        int tailCount = 0;

        for (int i = 0; i < 1000000; i++) {
            flip = (int) (Math.random() * 2);
            headCount = (flip == 0) ? headCount + 1 : headCount;
            tailCount = (flip == 1) ? tailCount + 1 : tailCount;
        }

        System.out.println("Head count: " + headCount);
        System.out.println("Tail count: " + tailCount);

    }
}
