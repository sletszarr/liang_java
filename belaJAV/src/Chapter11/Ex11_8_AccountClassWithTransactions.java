package Chapter11;

import mylib.Account;

/**
 * Created by bnamora on 10/18/16.
 */

public class Ex11_8_AccountClassWithTransactions {

    public static void main(String[] args) {

        // Creating account
        Account george = new Account("George", 1122, 1000, 1.5);

        // Account Transactions
        george.deposit(30);
        george.deposit(40);
        george.deposit(50);
        george.withdraw(5);
        george.withdraw(4);
        george.withdraw(2);

        // Print Account Summary
        System.out.println("Account Info");
        System.out.println("------------");
        System.out.println("Name: " + george.getName());
        System.out.println("Interest Rate: " +  george.getAnnualInterestRate() + "% p.a.");
        System.out.println("Balance: $ " + george.getBalance());
        System.out.println("\nTransactions");
        System.out.println("-------------");
        System.out.println("Type\tAmount\t\tBalance\t\tDescription");
        for (int i = 0; i < george.getTransactions().size(); i++) {
            System.out.printf("%c\t\t$ %.2f\t\t$ %.2f\t%s\n",
                    george.getTransactions().get(i).getType(),
                    george.getTransactions().get(i).getAmount(),
                    george.getTransactions().get(i).getBalance(),
                    george.getTransactions().get(i).getDescription());

        }
    }
}
