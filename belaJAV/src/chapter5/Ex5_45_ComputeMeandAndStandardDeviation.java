package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_45_ComputeMeandAndStandardDeviation {

    public static void main(String[] args) {

        double sum = 0,
                sumSquare = 0,
                num;

        Scanner input = new Scanner(System.in);

        // get number and compute sum
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextDouble();
            sum += num;
            sumSquare += (num * num);

        }

        System.out.println(sumSquare);
        // compute mean
        double mean = sum / 10;

        // compute standard deviation
        double deviationSquare = (sumSquare - sum * sum / 10) / 9;
        double deviation = Math.sqrt(deviationSquare);

        // display result
        System.out.println("The mean is " + mean);
        System.out.println("The standard deviation is " + deviation);


    }
}
