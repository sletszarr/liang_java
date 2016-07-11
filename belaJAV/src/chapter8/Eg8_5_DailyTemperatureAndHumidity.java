package chapter8;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/11/2016.
 */

public class Eg8_5_DailyTemperatureAndHumidity {

    public static void main(String[] args) {

        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;
        double[][][] weatherData =
                new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];

        Scanner input = new Scanner(System.in);
        // scan data from weather.txt
        for (int i = 0; i < NUMBER_OF_DAYS * NUMBER_OF_HOURS; i++) {
            int day = input.nextInt();
            int hour = input.nextInt();
            double temperature = input.nextDouble();
            double humidity = input.nextDouble();
            weatherData[day - 1][hour - 1][0] = temperature;
            weatherData[day - 1][hour - 1][1] = humidity;
        }

        // find average daily temperature and humidity
        for (int day = 0; day < NUMBER_OF_DAYS; day++) {
            double totalTemp = 0.0;
            double totalHumidity = 0.0;

            for (int hour = 0; hour < NUMBER_OF_HOURS; hour++) {
                totalTemp += weatherData[day][hour][0];
                totalHumidity += weatherData[day][hour][1];
            }

            // display result
            System.out.printf("Day %d's average temperature is %.2f\n",
                    day, totalTemp / NUMBER_OF_HOURS);
            System.out.printf("Day %d's average humidity is %.2f\n",
                    day, totalTemp / NUMBER_OF_HOURS);

        }

    }

}
