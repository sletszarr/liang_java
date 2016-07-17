package chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Created by bnamora on 6/16/16.
 */

public class Ex3_24_PickACard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random pickACard = new Random();

        int rank = pickACard.nextInt(12) + 1;
        int suit = pickACard.nextInt(4);

        //can be refactored using array like this
        //String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "Jack", "Queen", "King"};
        //String[] suits = {"Clubs", "Diamond", "Hearts", "Spades"};

        //System.out.println("The card you pick is " + ranks[rank] + " of " + suits[suit]);

        //but since we're learning selection if and switch..

        System.out.print("The card you picked is ");

        switch (rank) {
            case 1:
                System.out.print("Ace of ");
                break;
            case 2:
                System.out.print("2 of ");
                break;
            case 3:
                System.out.print("3 of ");
                break;
            case 4:
                System.out.print("4 of ");
                break;
            case 5:
                System.out.print("5 of ");
                break;
            case 6:
                System.out.print("6 of ");
                break;
            case 7:
                System.out.print("7 of ");
                break;
            case 8:
                System.out.print("8 of ");
                break;
            case 9:
                System.out.print("9 of ");
                break;
            case 10:
                System.out.print("Jack of ");
                break;
            case 11:
                System.out.print("Queen of ");
                break;
            case 12:
                System.out.print("King of ");
        }

        switch (suit) {
            case 0:
                System.out.print("Clubs");
                break;
            case 1:
                System.out.print("Diamonds");
                break;
            case 2:
                System.out.print("Hearts");
                break;
            case 3:
                System.out.print("Spades");
        }

    }
}
