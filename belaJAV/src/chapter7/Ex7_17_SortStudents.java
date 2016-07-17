package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/5/2016.
 */

public class Ex7_17_SortStudents {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numOfStudents = input.nextInt();

        String[] studentNames = new String[numOfStudents];
        double[] studentScores = new double[numOfStudents];

        System.out.println("Enter student's name and score");
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Student #" + (i + 1));

            // get student's name
            System.out.print("Name: ");
            studentNames[i] = input.next();

            // get student's score
            System.out.print("Score: ");
            studentScores[i] = input.nextDouble();

            System.out.println();
        }

        sortStudentBasedOnScore(studentNames, studentScores);

        printStudentReport(studentNames, studentScores);

    }

    public static void sortStudentBasedOnScore(String[] names, double[] scores) {

        int maxScoreIndex;
        double scoreTemp;
        String nameTemp;

        for (int i = 0; i < scores.length; i++) {
            maxScoreIndex = i;

            for (int k = i + 1; k < scores.length; k++) {
                if (scores[k] > scores[maxScoreIndex]) {
                    maxScoreIndex = k;
                }
            }

            if (maxScoreIndex != i) {
                // swap student's name
                nameTemp = names[i];
                names[i] = names[maxScoreIndex];
                names[maxScoreIndex] = nameTemp;

                // swap student's score
                scoreTemp = scores[i];
                scores[i] = scores[maxScoreIndex];
                scores[maxScoreIndex] = scoreTemp;
            }
        }
    }

    public static void printStudentReport(String[] names, double[] scores) {

        System.out.println("Name\t\t\tScore");
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s\t%.2f\n", names[i], scores[i]);
        }

    }
}
