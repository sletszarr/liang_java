package chapter8;

/**
 * Created by Acer-756 on 7/12/2016.
 */

public class Ex8_4_ComputeWeeklyHours {

    public static void main(String[] args) {

        int[][] weeklyHours = {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        // get employees' total week hours
        int[][] employeeWeekHours = computeTotalWeekHoursPerEmployee(weeklyHours);

        // sort employee by week hours
        sortEmployeeByWeekHours(employeeWeekHours);

        // display
        displayTotalWeekHours(employeeWeekHours);

    }

    public static int[][] computeTotalWeekHoursPerEmployee(int[][] weekHours) {
        int[][] totalWeekHours = new int[weekHours.length][2];

        for (int emp = 0; emp < weekHours.length; emp++) {
            int totalHours = 0;
            for (int hour = 0; hour < weekHours[emp].length; hour++) {
                totalHours += weekHours[emp][hour];
            }
            totalWeekHours[emp][0] = emp;
            totalWeekHours[emp][1] = totalHours;
        }

        return totalWeekHours;
    }

    public static void sortEmployeeByWeekHours(int[][] empWeekHours) {
        for(int i =0;i<empWeekHours.length;i++) {
            int maxHourIndex = i;
            int empTemp;
            int totalHoursTemp;

            for (int k = i + 1; k < empWeekHours.length; k++) {
                if (empWeekHours[k][1] > empWeekHours[maxHourIndex][1])
                    maxHourIndex = k;
            }

            if (maxHourIndex != i) {
                // swap employee
                empTemp = empWeekHours[i][0];
                empWeekHours[i][0] = empWeekHours[maxHourIndex][0];
                empWeekHours[maxHourIndex][0] = empTemp;

                // swap total hours
                totalHoursTemp = empWeekHours[i][1];
                empWeekHours[i][1] = empWeekHours[maxHourIndex][1];
                empWeekHours[maxHourIndex][1] = totalHoursTemp;
            }
        }
    }

    public static void displayTotalWeekHours(int[][] empWeekHours) {
        for (int[] emp : empWeekHours) {
            System.out.printf("Employee #%d has worked %d hours this week\n",
                    emp[0], emp[1]);
        }

    }

}
