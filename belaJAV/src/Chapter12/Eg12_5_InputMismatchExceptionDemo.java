package Chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bnamora on 1/21/17.
 */

public class Eg12_5_InputMismatchExceptionDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean continueInput = true;

        do {
            try {

                int num = input.nextInt();

                continueInput = false;

            }

            catch (InputMismatchException ex) {

                System.out.println("Try again. (Incorrect input: " +
                        "an integer is required");

                input.nextLine();

            }
        } while (continueInput);

    }
}
