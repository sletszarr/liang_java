package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/4/2016.
 */

public class Ex7_4_AnalyzeScores {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prepare scores holder
        double[] scores = new double[100];
        double theScore;

        // score counter
        int scoreCount = 0;

        // score sum and avg
        int scoreSum = 0;
        double average;

        // get score
        System.out.print("Enter scores: ");
        while (scoreCount < 100) {
            theScore = input.nextDouble();

            // stop asking for score
            if (theScore < 0) break;

            // don't save 0 score
            if (theScore == 0) continue;

            // save the score
            scores[scoreCount] = theScore;

            // sum the score
            scoreSum += theScore;

            // increase score count
            scoreCount++;
        }

        // get average
        average = scoreSum / (scoreCount + 1);
        System.out.println("The average score is " + average);

        // get average analysis
        int[] averageAnalysis = getAverageAnalysis(scores, average);
        System.out.println("Number of above average score: " +
                averageAnalysis[1]);
        System.out.println("Number of below average score: " +
                averageAnalysis[0]);

    }

    public static int[] getAverageAnalysis(double[] scores, double average) {

        // index 0 for below average
        // index 1 for above average
        int[] avgAnalysis = new int[2];

        for (double score: scores) {
            if (score == 0) break;
            if (score > average) avgAnalysis[1]++;
            if (score < average) avgAnalysis[0]++;
        }

        return avgAnalysis;

    }
}
