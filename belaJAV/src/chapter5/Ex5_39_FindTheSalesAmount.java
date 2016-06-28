package chapter5;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_39_FindTheSalesAmount {

    public static void main(String[] args) {

        double baseYearlySalary = 5000;
        double yearlyIncomeGoal = 30000;
        double targetCommission = yearlyIncomeGoal - baseYearlySalary;

        double commission;
        double salesAmount = 0.01;

        do {

            if (salesAmount <= 5000) {
                commission = salesAmount * 0.08;
            }
            else if (salesAmount <= 10000) {
                commission = (5000 * 0.08) + (salesAmount - 5000) * 0.1;
            }
            else {
                commission = (5000 * 0.08) + (10000 * 0.1) + (salesAmount - 10000) * 0.12;
            }

            salesAmount += 0.01;

        } while (commission < targetCommission);

        System.out.printf("To earn $%.2f from\n\n", yearlyIncomeGoal);
        System.out.printf("Base yearly salary: $%.2f\n", baseYearlySalary);
        System.out.printf("Commission: $%.2f\n", targetCommission);
        System.out.printf("\nThe minimum sales amount \nyou have to achieve is $%.2f", salesAmount);

    }
}
