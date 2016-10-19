package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * Created by bnamora on 10/19/16.
 */
public class Ex11_13_RemoveDuplicate {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // get 10 int to ArrayList numbers
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = input.nextInt();
            numbers.add(num);
        }

        // display ArrayList
        System.out.println(numbers.toString());

        // remove duplicates
        removeDuplicates(numbers);

        // display ArrayList
        System.out.println(numbers.toString());

    }

    public static void removeDuplicates(ArrayList<Integer> numbers) {

        ArrayList<Integer> control = new ArrayList<Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (control.contains(num)) {
                numbers.remove(i);
                i--;
                continue;
            }
            control.add(num);
        }

    }
}
