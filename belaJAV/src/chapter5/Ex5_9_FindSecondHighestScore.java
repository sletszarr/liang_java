package chapter5;

import java.util.Scanner;

/**
 * Created by bnamora on 6/22/16.
 */

public class Ex5_9_FindSecondHighestScore {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double score = 0;
        double secondHighestScore = 0;
        double highestScore = 0;

        String studentName = "";
        String secondHighestScoreStudent = "";
        String highestScoreStudent = "";

        System.out.print("Enter total number of students: ");
        int totalStudents = input.nextInt();


        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter the student's name: ");
            studentName = input.next();

            System.out.print("Enter his/her score: ");
            score = input.nextDouble();

            if (score == highestScore || score == secondHighestScore) {
                continue;
            }

            if (score > highestScore) {
                // change the highest to second highest
                secondHighestScore = highestScore;
                secondHighestScoreStudent = highestScoreStudent;

                // update the highest score
                highestScore = score;
                highestScoreStudent = studentName;
            }

            if (score > secondHighestScore && score < highestScore) {
                secondHighestScore = score;
                secondHighestScoreStudent = studentName;
            }

        }

        System.out.printf("\nThe student's name with the highest score %.2f is %s",
                highestScore, highestScoreStudent);

        System.out.printf("\nThe student's name with the second highest score %.2f is %s",
                secondHighestScore, secondHighestScoreStudent);

    }
}
