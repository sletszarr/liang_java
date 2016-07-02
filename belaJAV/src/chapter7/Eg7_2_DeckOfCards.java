package chapter7;

/**
 * Created by Acer-756 on 7/3/2016.
 */

public class Eg7_2_DeckOfCards {

    public static void main(String[] args) {

        // create decks
        int[] decks = new int[52];

        // initialize suits and ranks
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // initialize decks
        for (int i = 0; i < decks.length; i++) {
            decks[i] = i;
        }

        // shuffle decks
        for (int i = 0; i < decks.length; i++) {
            // generate random index
            int index = (int) (Math.random() * decks.length);

            // swap i with random index
            int temp = decks[i];
            decks[i] = decks[index];
            decks[index] = temp;
        }

        // display the first 4 cards
        for (int i = 0; i < 4; i++) {
            String suit = suits[decks[i] / 13];
            String rank = ranks[decks[i] % 13];
            System.out.println("Card #" + decks[i] + ": " + rank + " of " + suit);
        }

    }
}
