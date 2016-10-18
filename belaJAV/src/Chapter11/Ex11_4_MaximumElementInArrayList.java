package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 10/18/16.
 */

public class Ex11_4_MaximumElementInArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        System.out.print("Enter a list of numbers (ended with 0): ");
        while (true) {
            int num = input.nextInt();
            if (num == 0) break;
            list.add(num);
        }
        System.out.println("The maximum number in the array list is " + max(list));
    }

    public static Integer max(ArrayList<Integer> list) {
        int maxNum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int peekNum = list.get(i);
            if (peekNum > maxNum) {
                maxNum = peekNum;
            }
        }
        return maxNum;
    }
}
