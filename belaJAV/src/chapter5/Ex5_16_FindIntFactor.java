package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_16_FindIntFactor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get num from user
        System.out.print("Enter an int: ");
        int num = input.nextInt();

        // save num to numFactored
        int numFactored = num;

        // prepare string to hold the factors
        String factors = "";

        while (numFactored != 1) {

            // find the smallest factor of num
            for (int i = 2; i <= numFactored; i++) {

                // when the smallest factor is found
                if (numFactored % i == 0) {

                    // add it to the string holder
                    factors += i + " ";

                    // divide numFactored with its smallest factor
                    numFactored /= i;

                    // then break out from the for loop
                    break;
                }
            }
        }

        System.out.printf("the factor for %d is %s", num, factors);

    }

}
