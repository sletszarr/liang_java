package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 10/19/16.
 */
public class Ex11_17_PerfectSquares {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer m: ");
        int num = input.nextInt();

        // get the smallest factors
        ArrayList<Integer> smallestFactors = getSmallestFactors(num);

        // get n and display to console
        int n = getN(smallestFactors);
        System.out.println("The smallest number n for (m * n) to be a perfect square is " + n);
        System.out.printf("m * n is %d", num * n);



    }

    public static ArrayList<Integer> getSmallestFactors(int num) {

        ArrayList<Integer> smallestFactors = new ArrayList<Integer>();

        while (num != 1) {
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    num /= i;
                    smallestFactors.add(i);
                    break;
                }
            }
        }

        return smallestFactors;

    }

    public static int getN(ArrayList<Integer> smallestFactors) {

        int n = 1;

        // all factors in smallestFactors
        // will be treated as an array index
        int[] factorAppearances = new int[smallestFactors.get(smallestFactors.size() - 1)];

        // get factors' appearances
        for (int i = 0; i < smallestFactors.size(); i++) {
            factorAppearances[smallestFactors.get(i) - 1]++;
        }

        // get the product of all factors
        // that appears an odd number of times
        for (int i = 0; i < factorAppearances.length; i++) {

            // if index in factorAppearances is not a factor
            if (factorAppearances[i] == 0) {
                continue;
            }

            // if factor appears at an odd number of times
            // get the by product
            if ((factorAppearances[i]) % 2 == 1) {
                n *= (i + 1);
            }
        }

        return n;
    }
}
