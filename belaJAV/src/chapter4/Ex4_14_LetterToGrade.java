package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_14_LetterToGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char letterGrade = input.nextLine().charAt(0);
        int numericGrade = 0;

        if (letterGrade >= 'A' && letterGrade <= 'D') {
            numericGrade = letterGrade - 61;
            numericGrade -= (numericGrade % 4) * 2;
        }
        else if (letterGrade == 'F') {
            numericGrade = 0;
        } else {
            System.out.println(letterGrade + " is an invalid input");
            System.exit(1);
        }

        System.out.printf("The numeric value for grade %c is %d", letterGrade, numericGrade);

    }

}
