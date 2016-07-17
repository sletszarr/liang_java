package chapter7;

import java.util.Scanner;

/**
 * Created by Acer-756 on 7/5/2016.
 */

public class Ex7_18_BubbleSort {

    public static void main(String[] args) {

        double[] numbers = new double[10];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 doubles: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        bubbleSort(numbers, "asc");

        for(int i =0;i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
        }

    }

    public static void bubbleSort(double[] numbers, String order) {

        double temp;
        boolean asc = (order.equals("asc"));

        if (!order.equals("desc") && !order.equals("asc")) {
            System.out.println("Type asc for ascending order\n" +
                    "Type desc for descending order");
            System.exit(1);
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int k = 0; k < numbers.length - (i + 1); k++) {
                if (asc) {
                    if (numbers[k] > numbers[k + 1]) {
                        temp = numbers[k];
                        numbers[k] = numbers[k+1];
                        numbers[k + 1] = temp;
                    }
                }
                else{
                    if (numbers[k] < numbers[k + 1]) {
                        temp = numbers[k];
                        numbers[k] = numbers[k+1];
                        numbers[k + 1] = temp;
                    }

                }
            }
        }

    }


}
