package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_6_CircleWithStaticMembers {

    double radius;
    static int numberOfObjects = 0;

    Eg9_6_CircleWithStaticMembers() {
        radius = 1;
        numberOfObjects++;
    }

    Eg9_6_CircleWithStaticMembers(double radius) {
        this.radius = radius;
        numberOfObjects++;
    }

    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

}
