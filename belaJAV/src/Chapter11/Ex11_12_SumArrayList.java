package Chapter11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 10/19/16.
 */

public class Ex11_12_SumArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<Double>();

        // Get 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();
            numbers.add(num);
        }

        // get sum
        System.out.println("The sum of the list is : " + sum(numbers));
    }

    public static double sum(ArrayList<Double> numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        return sum;
    }
}
