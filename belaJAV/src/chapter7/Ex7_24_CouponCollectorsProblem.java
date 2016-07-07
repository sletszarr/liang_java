package chapter7;

/**
 * Created by Acer-756 on 7/7/2016.
 */

public class Ex7_24_CouponCollectorsProblem {

    public static void main(String[] args) {

        int[] decks = getADeckOfCards();
        int[] suitCounter = new int[4];
        int numberOfPicks = 0;

        String[] suits = {"Heart", "Spade", "Diamond", "Clover"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"};

        while (hasNotSeenEverySuit(suitCounter)) {
            shuffle(decks);

            // select a card
            int selectedCardIndex = (int) (Math.random() * 52);

            // display selected card
            System.out.printf("%s of %s\n",
                    ranks[selectedCardIndex % 13],
                    suits[selectedCardIndex / 13]);

            // increase the selected suit's count
            suitCounter[selectedCardIndex / 13]++;

            // increase the number of picks
            numberOfPicks++;

        }

        System.out.println("Number of picks: " + numberOfPicks);

    }

    public static int[] getADeckOfCards() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        return deck;
    }

    public static boolean hasNotSeenEverySuit(int[] suitCounter) {
        for (int suitCount : suitCounter) {
            if (suitCount == 0)
                return true;
        }
        return false;
    }

    public static void shuffle(int[] deck) {
        int randomIndex;
        int temp;

        // shuffle deck
        for (int i = 0; i < deck.length; i++) {
            // get random index
            randomIndex = (int) (Math.random() * 52);

            // swap it with #i
            temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

}
