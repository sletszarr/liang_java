package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_18_StudentMajorAndStatus {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters: ");
        String majorStatus = input.nextLine();

        if (majorStatus.length() == 2) {
            char major = majorStatus.charAt(0);
            char status = majorStatus.charAt(1);

            switch (major) {
                case 'M':
                    System.out.print("Mathematics");
                    break;
                case 'C':
                    System.out.print("Computer Science");
                    break;
                case 'I':
                    System.out.print("Information Technology");
                    break;
                default:
                    System.out.println("Your major is unknown");
                    System.exit(1);
            }

            switch (status) {
                case '1':
                    System.out.print(" Freshman");
                    break;
                case '2':
                    System.out.print(" Sophomore");
                    break;
                case '3':
                    System.out.print(" Junior");
                    break;
                case '4':
                    System.out.print(" Senior");
                    break;
                default:
                    System.out.println("Your status should be 1-4");
                    System.exit(1);
            }
        }
        else {
            System.out.println("Your input should be 2 characters");
            System.exit(1);
        }

    }
}
