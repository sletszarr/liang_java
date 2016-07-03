package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_1_AssignGrades {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // get total student
        System.out.print("Enter the number of students: ");
        int totalStudents = input.nextInt();

        // prepare array for student's score
        double[] studentScores = new double[totalStudents];

        // get student score
        System.out.print("Enter 4 scores: ");
        for (int i = 0; i < totalStudents; i++) {
            studentScores[i] = input.nextDouble();
        }

        // get student grade
        char[] studentGrades = getStudentGrades(studentScores);

        // display result
        for (int i=0;i<totalStudents;i++) {
            System.out.printf("Student %d score is %.2f and grade is %c\n",
                    i, studentScores[i], studentGrades[i]);
        }

    }

    // get the best score
    public static double getBestScore(double[] scores) {

        double bestScore = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        return bestScore;
    }

    // get grade based on best score
    public static char getGrade(double bestScore, double score) {

        if (score >= bestScore - 10) {
            return 'A';
        } else if (score >= bestScore - 20) {
            return 'B';
        } else if (score >= bestScore - 30) {
            return 'C';
        } else if (score >= bestScore - 40) {
            return 'D';
        } else {
            return 'F';
        }

    }

    // get all student's grade
    public static char[] getStudentGrades(double[] scores) {

        char[] studentGrades = new char[scores.length];
        double bestScore = getBestScore(scores);

        for (int i = 0; i < studentGrades.length; i++) {
            studentGrades[i] = getGrade(bestScore, scores[i]);
        }

        return studentGrades;
    }

}
