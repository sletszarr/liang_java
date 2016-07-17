package chapter5;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_7_FutureTuition {

    public static void main(String[] args) {

        double tuition = 10000;
        double increaseRate = 0.05;
        double total4YearsCost = 0;
        double tuitionIn10Years = 0;

        for (int i = 1; i <= 14; i++) {
            tuition = tuition * (1 + increaseRate);

            tuitionIn10Years = (i == 10) ? tuition : tuitionIn10Years;
            total4YearsCost = (i > 10) ? total4YearsCost + tuition : total4YearsCost;

        }

        System.out.printf("Tuition rate in 10 years is $%.2f\n" , tuitionIn10Years);
        System.out.printf("4 years tuition cost after 10 years is $%.2f\n", total4YearsCost);

    }
}
