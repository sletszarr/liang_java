package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_21_CheckSSN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String userSSN = input.nextLine();

        if (userSSN.length() == 11) {
            boolean firstPartIsValid = (Character.isDigit(userSSN.charAt(0)) &&
                    Character.isDigit(userSSN.charAt(1)) &&
                    Character.isDigit(userSSN.charAt(2))
            );

            boolean secondPartIsValid = (Character.isDigit(userSSN.charAt(4)) &&
                    Character.isDigit(userSSN.charAt(5))
            );

            boolean lastPartIsValid = (Character.isDigit(userSSN.charAt(7)) &&
                    Character.isDigit(userSSN.charAt(8)) &&
                    Character.isDigit(userSSN.charAt(9)) &&
                    Character.isDigit(userSSN.charAt(10))
            );

            boolean validDelimiter = (userSSN.charAt(3) == '-') && (userSSN.charAt(6) == '-');

            boolean isValidSSN = (firstPartIsValid && secondPartIsValid && lastPartIsValid && validDelimiter);

            System.out.println(isValidSSN ? userSSN + " is a valid social security number" :
                            userSSN + " is an invalid social security number"
            );

        }
        else {
            System.out.println("You must enter 11 characters including -");
            System.exit(1);
        }

    }
}
