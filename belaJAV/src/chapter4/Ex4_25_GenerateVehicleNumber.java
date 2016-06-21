package chapter4;


/**
 * Created by bnamora on 6/21/16.
 */

public class Ex4_25_GenerateVehicleNumber {

    public static void main(String[] args) {

        int char1 = (char) (int) (65 + Math.random() * 26);
        int char2 = (char) (int) (65 + Math.random() * 26);
        int char3 = (char) (int) (65 + Math.random() * 26);

        int digit1 = (int) (1 * Math.random() * 10);
        int digit2 = (int) (Math.random() * 10);
        int digit3 = (int) (Math.random() * 10);
        int digit4 = (int) (Math.random() * 10);

        System.out.printf("Your plate number is %c%c%c %d%d%d%d", char1, char2, char3,
                digit1, digit2, digit3, digit4);

    }
}
