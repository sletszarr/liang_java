package chapter8;

import java.util.Scanner;

/**
 * Created by bnamora on 7/18/16.
 */

public class Ex8_21_CentralCity {

    public static void main(String[] args) {

        // get cities' coordinate
        double[][] cities = getCitiesCoordinate();

        // get total distances of each city to all other cities
        double[] totalDistances = getTotalDistanceToOtherCities(cities);

        // get central city
        int centralCity = getCentralCity(totalDistances);

        // display central city
        System.out.printf("The central city is at (%.1f, %.1f)\n",
                cities[centralCity][0], cities[centralCity][1]);
        System.out.printf("The total distance to all other cities is %.2f",
                totalDistances[centralCity]);

    }

    public static double[][] getCitiesCoordinate() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of cities: ");
        int numOfCities = input.nextInt();

        double[][] cities = new double[numOfCities][2];

        for (int city = 0; city < cities.length; city++) {
            System.out.print("Enter city #"+city+"'s coordinate: ");
            cities[city][0] = input.nextDouble();
            cities[city][1] = input.nextDouble();
        }

        return cities;

    }

    public static double[] getTotalDistanceToOtherCities(double[][] cities) {

        double[] totalDistances = new double[cities.length];

        for (int origin = 0; origin < cities.length; origin++) {
            for (int dest = 0; dest < cities.length; dest++) {
                if (origin == dest) {
                    continue;
                }
                totalDistances[origin] += getDistance(cities[origin], cities[dest]);
            }
        }

        return totalDistances;

    }

    public static double getDistance(double[] city1, double[] city2) {

        double x1 = city1[0];
        double y1 = city1[1];
        double x2 = city2[0];
        double y2 = city2[1];

        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    public static int getCentralCity(double[] totalDistances) {

        int centralCity = 0;
        for (int city = 0; city < totalDistances.length; city++) {
            if (totalDistances[city] < totalDistances[centralCity]) {
                centralCity = city;
            }
        }

        return centralCity;

    }

}
