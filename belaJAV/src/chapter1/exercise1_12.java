package chapter1;

/**
 * Created by bnamora on 6/8/16.
 */
public class Exercise1_12 {

    public static void main(String[] args) {

        double kms = 24 * 1.6;
        double hours = 1.0 + 40.0 / 60 + 35.0 / 3600;

        System.out.println("A runner runs " + kms + " kms in " + hours + " hours");
        System.out.println("His average speed is " + kms / hours + " km/hour");

    }
}
