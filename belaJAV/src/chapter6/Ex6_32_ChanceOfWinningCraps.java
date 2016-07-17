package chapter6;

/**
 * Created by Acer-756 on 7/2/2016.
 */
public class Ex6_32_ChanceOfWinningCraps {

    public static void main(String[] args) {

        int winCount = 0;

        for(int i =0;i<10000;i++) {
            winCount = playCraps() ? winCount + 1 : winCount;
        }

        System.out.println("You win " + winCount + " times");

    }

    public static int getSum() {

        int firstRoll = (int) (1 + Math.random() * 6);
        int secondRoll = (int) (1 + Math.random() * 6);
        int sum = firstRoll + secondRoll;

//        System.out.println("You rolled " +
//                firstRoll + " + " + secondRoll +
//                " = " + sum
//        );

        return sum;
    }

    public static boolean playCraps() {
        int sum = getSum();
        int point;

        if (sum == 2 || sum == 3 || sum == 12) {
//            System.out.println("You lose.");
            return false;
        }
        else if (sum == 7 || sum == 1) {
//            System.out.println("You win.");
            return true;
        }
        else {
            point = sum;
//            System.out.println("Point is "+point);
            return resolvePoint(point);
        }

    }

    public static boolean resolvePoint(int point) {

        int sum;

        do {
            sum = getSum();

//            if (sum == point) {
//                System.out.println("You win.");
//            }
//            else if (sum == 7) {
            if (sum == 7) {
//                System.out.println("You lose.");
                return false;
            }
//            else{
//                System.out.println("Point is " + point);
//            }
        } while (sum != point);

        return true;

    }
}
