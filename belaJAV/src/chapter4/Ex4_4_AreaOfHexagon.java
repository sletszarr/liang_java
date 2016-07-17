package chapter4;

import java.util.Scanner;

/**
 * Created by bnamora on 6/19/16.
 */

public class Ex4_4_AreaOfHexagon {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompt user to get hexagon's side
        System.out.print("Enter the side: ");
        double hexagonSide = input.nextDouble();

        // calculate hexagon side
        double hexagonArea = 6 * hexagonSide * hexagonSide / (4 * Math.tan(Math.PI / 6));

        // display result
        System.out.println("The area of the hexagon is " + Math.round(hexagonArea * 100) / 100.0);

    }
}
