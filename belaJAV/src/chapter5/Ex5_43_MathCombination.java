package chapter5;

/**
 * Created by bnamora on 6/28/16.
 */

public class Ex5_43_MathCombination {

    public static void main(String[] args) {

        int combinationCount = 0;

        for (int k = 1; k <= 7; k++) {

            for (int l = k + 1; l <= 7; l++) {
                System.out.printf("%d %d\n", k, l);
                combinationCount++;
            }
        }

        System.out.println("The total number of all combinations is " + combinationCount);

    }
}
