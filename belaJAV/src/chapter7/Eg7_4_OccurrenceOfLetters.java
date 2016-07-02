package chapter7;

import chapter6.Eg6_10_RandomCharacter;

/**
 * Created by Acer-756 on 7/3/2016.
 */

public class Eg7_4_OccurrenceOfLetters {

    public static void main(String[] args) {

        // create char array
        // with random lower case letter
        char[] chars = createRandomCharArray();

        // create counting array
        int[] count = charOccurrenceCounter(chars);

        // display char array
        printChars(chars);

        System.out.println("\nThe occurrence of each letter is: ");

        // display count array
        printCharOccurence(count);
    }

    public static char[] createRandomCharArray() {

        char[] chars = new char[100];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Eg6_10_RandomCharacter.getRandomLowerCaseLetter();
        }

        return chars;

    }

    public static int[] charOccurrenceCounter(char[] chars) {

        int[] count = new int[26];

        for (int i = 0;i<chars.length;i++) {
            count[chars[i] - 'a']++;
        }

        return count;

    }

    public static void printChars(char[] chars) {

        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

    }

    public static void printCharOccurence(int[] count) {

        for (int i = 0; i < count.length; i++) {
            System.out.printf("[%c: %2d] ", i + 'a', count[i]);
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }
    }
}
