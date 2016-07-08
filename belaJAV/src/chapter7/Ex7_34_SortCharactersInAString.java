package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_34_SortCharactersInAString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();

        System.out.println("The sorted string is " + sort(s));

    }

    public static String sort(String s) {
        char[] sortedString = s.toCharArray();
        int minIndex;
        char temp;

        for (int i = 0; i < sortedString.length; i++) {
            minIndex = i;

            for (int k = i + 1; k < sortedString.length; k++) {
                if (sortedString[k] < sortedString[minIndex])
                    minIndex = k;
            }

            if (minIndex != i) {
                temp = sortedString[i];
                sortedString[i] = sortedString[minIndex];
                sortedString[minIndex] = temp;
            }
        }

        return String.copyValueOf(sortedString);
    }
}
