package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 8/2/16.
 */

public class Eg11_9_DistinctNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers (input ends with 0): ");
        int value;

        // get distinct number
        do {
            value = input.nextInt();
            if (!list.contains(value) && value != 0)
                list.add(value);
        } while (value != 0);

        // display distinct number
        for (int num : list) {
            System.out.print(num+" ");
        }
    }
}
