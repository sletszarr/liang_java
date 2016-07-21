package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_9_TestCircleWithPrivateDataFields {

    public static void main(String[] args) {

        // create circle with radius 5
        Eg9_8_CircleWithPrivateDataFields myCircle =
                new Eg9_8_CircleWithPrivateDataFields(5.0);
        System.out.println("The area of the circle of radius " +
                myCircle.getRadius() + " is " + myCircle.getArea());

        // increase myCircle radius by 10%
        myCircle.setRadius(myCircle.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " +
                myCircle.getRadius() + " is " + myCircle.getArea());

        System.out.println("The number of objects created is " +
                Eg9_8_CircleWithPrivateDataFields.getNumberOfObjects());

    }
}
