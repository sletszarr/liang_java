package chapter5;


/**
 * Created by bnamora on 6/21/16.
 */

public class Eg5_7_MultiplicationTable {

    public static void main(String[] args) {

        // display the table heading
        System.out.println("           Multiplication Table");

        // display the number title
        System.out.print("    ");
        for (int i = 1; i < 10; i++) {
            System.out.printf("   %d", i);
        }

        System.out.println("\n----------------------------------------");

        // display table body
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d | ", i);

            for (int j = 1; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
