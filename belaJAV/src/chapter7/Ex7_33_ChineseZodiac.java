package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_33_ChineseZodiac {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] chineseYear = {"monkey", "rooster", "dog", "pig", "rat", "ox",
                "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        // get year
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // display chinese year zodiac
        System.out.println(chineseYear[year % 12]);

    }
}
