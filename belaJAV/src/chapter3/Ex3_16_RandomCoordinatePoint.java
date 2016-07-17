package chapter3;

import java.util.Random;

/**
 * Created by bnamora on 6/15/16.
 */

public class Ex3_16_RandomCoordinatePoint {

    public static void main(String[] args) {

        Random rand = new Random();

        int x = rand.nextInt(101) - 50;
        int y = rand.nextInt(201) - 50;

        System.out.println("(x,y) = (" + x + "," + y + ")");

    }
}
