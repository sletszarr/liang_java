package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_10_TestPassObject {

    public static void main(String[] args) {

        // create circle object
        // with radius 1
        Eg9_8_CircleWithPrivateDataFields myCircle =
                new Eg9_8_CircleWithPrivateDataFields(1);

        // print areas of a circle
        // with radius 1-5
        int n = 5;
        printAreas(myCircle, n);

        // see myCircle.radius and n
        System.out.println("\nRadius is " + myCircle.getRadius());
        System.out.println("n is " + n);

    }

    public static void printAreas(
            Eg9_8_CircleWithPrivateDataFields c, int times) {

        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}
