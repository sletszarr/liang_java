package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/20/16.
 */

public class Ex4_10_GuessBirthdayRewrite {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String set1 =
                " 1  3  5  7\n" +
                " 9 11 13 15\n" +
                "17 10 21 23\n" +
                "25 27 29 31";

        String set2 =
                " 2  3  6  7\n" +
                "10 11 14 15\n" +
                "18 19 22 23\n" +
                "26 27 30 31";

        String set3 =
                " 4  5  6  7\n" +
                "12 13 14 15\n" +
                "20 21 22 23\n" +
                "28 29 30 31";

        String set4 =
                " 8  9 10 11\n" +
                "12 13 13 15\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        String set5 =
                "16 17 18 19\n" +
                "20 21 22 23\n" +
                "24 25 26 27\n" +
                "28 29 30 31";

        int day = 0;

        System.out.println("Is your birthday in set1? ");
        System.out.println(set1);
        System.out.print("Enter Y for yes and N for no: ");
        char answer = input.nextLine().charAt(0);
        day = (answer == 'Y') ? day++ : day;

        System.out.println("Is your birthday in set2? ");
        System.out.println(set2);
        System.out.print("Enter Y for yes and N for no: ");
        answer = input.nextLine().charAt(0);
        day = (answer == 'Y') ? day+=2 : day;

        System.out.println("Is your birthday in set3? ");
        System.out.println(set3);
        System.out.print("Enter Y for yes and N for no: ");
        answer = input.nextLine().charAt(0);
        day = (answer == 'Y') ? day+=4 : day;

        System.out.println("Is your birthday in set4? ");
        System.out.println(set4);
        System.out.print("Enter Y for yes and N for no: ");
        answer = input.nextLine().charAt(0);
        day = (answer == 'Y') ? day+=8 : day;

        System.out.println("Is your birthday in set5? ");
        System.out.println(set5);
        System.out.print("Enter Y for yes and N for no: ");
        answer = input.nextLine().charAt(0);
        day = (answer == 'Y') ? day+=16 : day;

        System.out.println("Your birthday is " + day);

    }

}
