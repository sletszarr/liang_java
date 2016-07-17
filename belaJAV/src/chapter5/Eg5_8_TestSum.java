package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_8_TestSum {

    public static void main(String[] args) {

        // initialize sum
        float sum = 0;

        // add 0.01, 0.02, ..., 0.09, 1 to sum
        for (float i = 0.01f; i <= 1.0f; i+=0.01f) {
            sum += i;
        }

        // display result
        System.out.println("The sum is " + sum);

    }
}
