package Chapter11;

import mylib.SavingsAccount;
import mylib.CheckingAccount;

/**
 * Created by bnamora on 10/18/16.
 */

public class Ex11_3_CheckingAndSavingsAccount {

    public static void main(String[] args) {

        SavingsAccount baginda = new SavingsAccount(1, 1000, 12);
        CheckingAccount namora = new CheckingAccount(1, 1000, 12, 500);

        System.out.println("Baginda's Balance: " + baginda.getBalance());
        baginda.withdraw(900);
        System.out.println("Baginda's Balance: " + baginda.getBalance());
        baginda.withdraw(200);
        System.out.println("Baginda's Balance: " + baginda.getBalance());

        System.out.println("Namora's Balance: " + namora.getBalance());
        namora.withdraw(900);
        System.out.println("Namora's Balance: " + namora.getBalance());
        namora.withdraw(500);
        System.out.println("Namora's Balance: " + namora.getBalance());
        namora.withdraw(150);
        System.out.println("Namora's Balance: " + namora.getBalance());
    }
}
