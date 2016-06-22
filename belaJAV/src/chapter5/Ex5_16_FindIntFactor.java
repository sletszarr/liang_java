package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_16_FindIntFactor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an int: ");
        int num = input.nextInt();
        String factors = num + ".";

        for (int i = num / 2; i > 0; i--) {
            factors = (num % i == 0) ? i + ", " + factors : factors;
        }

        System.out.printf("the factor for %d is %s", num, factors);

    }

}
