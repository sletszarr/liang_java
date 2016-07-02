package chapter6;

/**
 * Created by Acer-756 on 7/2/2016.
 */

public class Ex6_30_CrapsGame {

    public static void main(String[] args) {

        int sum = getSum();
        int point;

        if (sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You lose");
        }
        else if (sum == 7 || sum == 11) {
            System.out.println("You win");
        }
        else {
            point = sum;
            System.out.println("Point is " + point);
            resolvePoint(point);
        }

    }

    public static int getSum() {

        int firstRoll = (int) (1 + Math.random() * 6);
        int secondRoll = (int) (1 + Math.random() * 6);
        int sum = firstRoll + secondRoll;

        System.out.println("You rolled " +
                firstRoll + " + " + secondRoll +
                " = " + sum
        );

        return sum;

    }

    public static void resolvePoint(int point) {

        int sum;

        do {
            sum = getSum();

            if (sum == point) {
                System.out.println("You win");
            }
            else if (sum == 7) {
                System.out.println("You lose");
                break;
            }
            else {
                System.out.println("Point is " + point);
            }
        } while (sum != point);
    }

}