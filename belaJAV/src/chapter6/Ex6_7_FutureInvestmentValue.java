package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_7_FutureInvestmentValue {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 1200;

        System.out.println(" Years\t\tFuture Value");
        for (int i = 1; i <= 30; i++) {
            System.out.printf("\t%2d\t\t%.2f\n",
                    i, futureInvestmentValue(investmentAmount, monthlyInterestRate, i));
        }

    }

    public static double futureInvestmentValue(
            double investmentAmount, double monthlyInterestRate, int years) {

        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

    }


}
