package chapter6;

/**
 * Created by bnamora on 6/29/16.
 */

public class Eg6_4_Increment {

    public static void main(String[] args) {

        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);

    }

    public static void increment(int num) {

        num++;
        System.out.println("n inside the method is " + num);

    }

}
