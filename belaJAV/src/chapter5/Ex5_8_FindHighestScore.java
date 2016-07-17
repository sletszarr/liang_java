package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_8_FindHighestScore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double highestScore = 0;
        double score = 0;
        String studentName = "";
        String studentWithHighestScore = "";

        System.out.print("Enter the number of students: ");
        int totalStudents = input.nextInt();

        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter a student name: ");
            studentName = input.next();

            System.out.print("Enter his/her score: ");
            score = input.nextDouble();

            if (score > highestScore) {
                highestScore = score;
                studentWithHighestScore = studentName;
            }
        }

        System.out.printf("The student's name with the highest score %.2f is %s",
                highestScore, studentWithHighestScore);

    }
}
