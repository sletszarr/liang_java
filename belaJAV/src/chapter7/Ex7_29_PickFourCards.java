package chapter7;

/**
 * Created by Acer-756 on 7/8/2016.
 */

public class Ex7_29_PickFourCards {

    public static void main(String[] args) {

        int[] deck = initializeDeck();
        int[] selectedCard = new int[4];
        int cardIndex;
        int sumOfRanks = 0;
        int numberOfPicks = 0;

        String[] suits = {"Heart", "Spades", "Diamond", "Clover"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King"};


        while (sumOfRanks != 24) {
            shuffle(deck);
            sumOfRanks = 0;

            // display the nth pick
            System.out.println("Pick #" + (numberOfPicks + 1));

            // pick 4 cards
            for (int i = 0; i < selectedCard.length; i++) {
                cardIndex = (int) (Math.random() * 52);
                selectedCard[i] = deck[cardIndex];

                // display selected card
                System.out.printf("[%2d] %s of %s\n",
                        selectedCard[i] % 13 + 1,
                        ranks[selectedCard[i] % 13],
                        suits[selectedCard[i] / 13]);

                // sum the ranks
                sumOfRanks += selectedCard[i] % 13 + 1;

            }

            // display the sum of the rank
            System.out.printf("[%2d]\n\n", sumOfRanks);

            // increase number of picks
            numberOfPicks++;
        }

        System.out.println("Number of picks: " + numberOfPicks);

    }

    public static int[] initializeDeck() {
        int[] deck = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        return deck;
    }

    public static void shuffle(int[] deck) {
        int randomIndex;
        int temp;

        for (int i = 0; i < deck.length; i++) {
            randomIndex = (int) (Math.random() * 52);

            // swap #i with random index
            temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }

    }


}
