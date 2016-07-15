package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/15/2016.
 */

public class Ex8_17_FinancialTsunami {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of banks: ");
        int numOfBanks = input.nextInt();

        System.out.print("Enter the limit: ");
        double limit = input.nextDouble();

        double[] balance = getBanksBalance(numOfBanks);
        double[][] borrowers = getBankLoans(numOfBanks);
        double[] totalAssets = getAssetsAssessments(limit, balance, borrowers);

        displayUnsafeBanks(limit, totalAssets);

    }

    public static double[] getBanksBalance(int numOfBanks) {
        Scanner input = new Scanner(System.in);

        double[] banks = new double[numOfBanks];
        for (int i = 0; i < numOfBanks; i++) {
            System.out.print("Enter bank #" + i + "'s balance: ");
            banks[i] = input.nextDouble();
        }

        return banks;
    }

    public static double[][] getBankLoans(int numOfBanks) {
        Scanner input = new Scanner(System.in);

        double[][] borrowers = new double[numOfBanks][numOfBanks];

        for (int i = 0; i < numOfBanks; i++) {
            System.out.print("How many banks borrows" +
                    "from bank #" + i + ": ");
            int totalBorrowers = input.nextInt();

            for (int k = 0; k < totalBorrowers; k++) {
                System.out.print("Borrower's id: ");
                int borrowersId = input.nextInt();

                System.out.print("Loan amount: ");
                borrowers[i][borrowersId] = input.nextDouble();
            }
        }

        return borrowers;
    }

    public static double[] getAssetsAssessments(
            double limit, double[] balance, double[][] borrowers) {

        double[] totalAsset = new double[balance.length];

        for (int bankId = 0; bankId < totalAsset.length; bankId++) {

            totalAsset[bankId] = getBanksAssets(bankId, balance, borrowers);

            if (totalAsset[bankId] < limit) {
                // all banks, that lend money to bankId,
                // can not count the loan on their asset
                for (int lender = 0; lender < borrowers.length; lender++) {
                    if (borrowers[lender][bankId] != 0) {
                        borrowers[lender][bankId] = 0;
                        totalAsset[lender] = getBanksAssets(lender, balance, borrowers);
                    }
                }
            }
        }

        return totalAsset;

    }

    public static double getBanksAssets(
            int bankId, double[] balance, double[][] borrowers) {

        double banksAssets = balance[bankId];

        for (int i = 0; i < borrowers[bankId].length; i++) {
            banksAssets += borrowers[bankId][i];
        }

        return banksAssets;
    }

    public static void displayUnsafeBanks(double limit, double[] totalAssets) {

        System.out.print("Unsafe banks are ");
        for(int i =0;i<totalAssets.length;i++) {
            System.out.print((totalAssets[i] < limit) ? i + " " : "");
        }

    }

}
