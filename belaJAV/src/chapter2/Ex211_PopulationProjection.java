package chapter2;

import java.util.Scanner;

/**
 * Created by bnamora on 6/13/16.
 */

public class Ex211_PopulationProjection {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double currentPopulation = 312032486;

        double totalSecondsInAYear = 60 * 60 * 24 * 365;
        double totalBirthsInAYear = totalSecondsInAYear / 7.0;
        double totalDeathsInAYear = totalSecondsInAYear / 13.0;
        double totalImmigrantsInAYear = totalSecondsInAYear / 45.0;

        double totalPopGrowthInAYear = totalBirthsInAYear - totalDeathsInAYear + totalImmigrantsInAYear;

        System.out.print("Enter the number of years: ");
        int numOfYears = input.nextInt();

        long popProjection = (long) (currentPopulation + totalPopGrowthInAYear * numOfYears);

        System.out.println("The population in 5 years is " + popProjection);

    }
}
