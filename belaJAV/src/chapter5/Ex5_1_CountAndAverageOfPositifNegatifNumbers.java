package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_1_CountAndAverageOfPositifNegatifNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number = -1;
        double sum = 0;
        int count = 0;
        int countPos = 0;
        int countNeg = 0;

        System.out.print("Enter an integer, the input ends if it is 0: ");
        while (number != 0) {
            number = input.nextInt();

            if (number == 0)
                break;

            countNeg = (number < 0) ? ++countNeg : countNeg;
            countPos = (number > 0) ? ++countPos : countPos;
            count++;
            sum += number;
        }

        if (count == 0) {
            System.out.println("No numbers are entered except 0");
        }
        else {
            System.out.println("The number of positives is " + countPos);
            System.out.println("The number of negatives is " + countNeg);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + sum / count);
        }

    }

}
