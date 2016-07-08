package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/9/2016.
 */

public class Ex7_35_HangmanGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prepare random words
        String[] words = {"obama", "programming", "aikido", "maldives",
                "majestic", "electronic", "apple"};

        // prepare & initialize variable
        String selectedWord;
        char guess;
        char replay = 'y';
        char[] misteryWord;
        int misedCounter = 0;

        // start the game
        while (replay == 'y') {

            // get random word from words
            selectedWord = getRandomWords(words);

            // prepare asterisked version of the random word
            misteryWord = initializeMisteryWord(selectedWord);

            // start guessing
            do {
                System.out.print("(Guess) enter a letter in word ");
                System.out.print(misteryWord);
                System.out.print(" > ");

                // get guess from user
                guess = input.nextLine().charAt(0);

                // check guess
                // increase missed counter if it's wrong
                misedCounter += guessCharInWord(guess, selectedWord, misteryWord);

            } while (misteryWordIsNotUnveiled(misteryWord));

            // display summary
            System.out.print("The word is " + selectedWord +
                    ". You missed " + misedCounter + " time\n"
            );

            // ask to replay
            System.out.print("Do you want to guess another word?" +
                    "Enter y or n > ");
            replay = input.nextLine().charAt(0);
        }

    }

    public static String getRandomWords(String[] words) {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    public static char[] initializeMisteryWord(String s) {
        char[] misteryWord = new char[s.length()];
        for(int i =0;i<misteryWord.length;i++) {
            misteryWord[i] = '*';
        }
        return misteryWord;
    }

    public static int guessCharInWord(char ch, String selectedWord, char[] misteryWord) {
        // check if ch is already in misteryWord
        for (char letter : misteryWord) {
            if (ch == letter) {
                System.out.println("\t" + ch + " is already in the word");
                return 0;
            }
        }

        // check if ch is in selectedWord
        // then unveil misteryWord if it is
        boolean charIsNotInSelectedWord = true;
        for (int i = 0; i < selectedWord.length(); i++) {
            if (ch == selectedWord.charAt(i)) {
                misteryWord[i] = ch;
                charIsNotInSelectedWord = false;
            }
        }

        // tell user if ch is not in the word
        if (charIsNotInSelectedWord) {
            System.out.println("\t" + ch + " is not in the word");
            return 1;
        }

        return 0;
    }

    public static boolean misteryWordIsNotUnveiled(char[] misteryWord) {
        for (char letter : misteryWord) {
            if (letter == '*')
                return true;
        }
        return false;
    }

}
