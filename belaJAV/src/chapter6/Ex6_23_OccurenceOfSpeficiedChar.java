package chapter6;

import java.util.Scanner;

/**
 * Created by bnamora on 6/30/16.
 */

public class Ex6_23_OccurenceOfSpeficiedChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.next();

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);

        int occurenceOfCh = count(str, ch);

        System.out.println("There are " +
                occurenceOfCh +
                ((occurenceOfCh == 1) ? " occurence" : " occurences") +
                " of " + ch + " in " + str);

    }

    public static int count(String str, char ch) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            count = (str.charAt(i) == ch) ? count + 1 : count;
        }

        return count;
    }
}
