package chapter1;

/**
 * Created by bnamora on 6/7/16.
 *
 * (Population projection)
 * The U.S. Census Bureau projects population based on the following assumptions:
 *      ■ One birth every 7 seconds
 *      ■ One death every 13 seconds
 *      ■ One new immigrant every 45 seconds
 *
 * Write a program to display the population for each of the next five years.
 * Assume the current population is 312,032,486 and one year has 365 days.
 * Hint: In Java, if two integers perform division, the result is an integer.
 * The fractional part is truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5).
 * To get an accurate result with the fractional part,
 * one of the values involved in the division must be a number with a decimal point.
 * For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 *
 */

public class Ex1_11_PopulationProjection {

    public static void main(String[] args) {

        double totalSecondsIn5Years = 60 * 60 * 24 * 365 * 5;
        double totalBirthsIn5Years = totalSecondsIn5Years / 7.0;
        double totalDeathsIn5Years = totalSecondsIn5Years / 13.0;
        double totalImmigrantsIn5Years = totalSecondsIn5Years / 45.0;

        double currentPopulation = 312032486;
        double populationGrowthIn5Years = totalBirthsIn5Years + totalImmigrantsIn5Years - totalDeathsIn5Years;

        System.out.println("Current population: " + currentPopulation);
        System.out.println("Population in 5 years: " + currentPopulation + populationGrowthIn5Years);
        System.out.println("Population in 10 years: " + currentPopulation + populationGrowthIn5Years * 2);
        System.out.println("Population in 15 years: " + currentPopulation + populationGrowthIn5Years * 3);
        System.out.println("Population in 20 years: " + currentPopulation + populationGrowthIn5Years * 4);
        System.out.println("Population in 25 years: " + currentPopulation + populationGrowthIn5Years * 5);
    }
}
