package chapter3;

import java.util.Scanner;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_5_FindFutureDate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int dayToday = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDay = input.nextInt();
        int dayFuture = (elapsedDay + dayToday) % 7;

        // can be refactored using array
        // String[] dayName = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        // System.out.println("Today is "+dayName[dayToday]+" and the future is "+dayName[dayFuture]);

        switch (dayToday) {
            case 0:
                System.out.printf("Today is Sunday ");
                break;
            case 1:
                System.out.printf("Today is Monday ");
                break;
            case 2:
                System.out.printf("Today is Tuesday ");
                break;
            case 3:
                System.out.printf("Today is Wednesday ");
                break;
            case 4:
                System.out.printf("Today is Thursday ");
                break;
            case 5:
                System.out.printf("Today is Friday ");
                break;
            case 6:
                System.out.printf("Today is Saturday ");
                break;
            default:
                System.out.println("You've entered invalid day");
                System.exit(1);
        }
        switch (dayFuture) {
            case 0:
                System.out.printf("and the future day is Sunday");
                break;
            case 1:
                System.out.printf("and the future day is Monday");
                break;
            case 2:
                System.out.printf("and the future day is Tuesday");
                break;
            case 3:
                System.out.printf("and the future day is Wednesday");
                break;
            case 4:
                System.out.printf("and the future day is Thursday");
                break;
            case 5:
                System.out.printf("and the future day is Friday");
                break;
            case 6:
                System.out.printf("and the future day is Saturday");
                break;
            default:
                System.out.println("You've entered invalid day");
                System.exit(1);
        }
    }
}
