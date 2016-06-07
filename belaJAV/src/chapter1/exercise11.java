package chapter1;

/**
 * Created by bnamora on 6/7/16.
 */
public class exercise11 {

    public static void main(String[] args) {

        double totalSecondsIn5Years = 60 * 60 * 24 * 365 * 5;
        double totalBirthsIn5Years = totalSecondsIn5Years / 7.0;
        double totalDeathsIn5Years = totalSecondsIn5Years / 13.0;
        double totalImmigrantsIn5Years = totalSecondsIn5Years / 45.0;

        double currentPopulation = 312032486;
        double populationIn5Years = totalBirthsIn5Years + totalImmigrantsIn5Years - totalDeathsIn5Years;

        System.out.println("Current population: " + currentPopulation);
        System.out.println("Population in 5 years: " + currentPopulation + populationIn5Years);
        System.out.println("Population in 10 years: " + currentPopulation + populationIn5Years * 2);
        System.out.println("Population in 15 years: " + currentPopulation + populationIn5Years * 3);
        System.out.println("Population in 20 years: " + currentPopulation + populationIn5Years * 4);
        System.out.println("Population in 25 years: " + currentPopulation + populationIn5Years * 5);

    }
}
