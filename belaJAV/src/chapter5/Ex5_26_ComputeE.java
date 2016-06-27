package chapter5;

/**
 * Created by bnamora on 6/27/16.
 */

public class Ex5_26_ComputeE {

    public static void main(String[] args) {

        double e = 1.0;
        int factorial = 1;

        for (int i = 1; i < 10; i++) {
            factorial *= i;
            e += 1.0 / factorial;
        }

        System.out.println(e);
    }
}
