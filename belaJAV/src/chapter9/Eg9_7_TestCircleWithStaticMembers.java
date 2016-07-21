package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_7_TestCircleWithStaticMembers {

    public static void main(String[] args) {

        System.out.println("Before creating objects");
        System.out.println("The number of Circle objects is " +
                Eg9_6_CircleWithStaticMembers.numberOfObjects);

        // create c1
        Eg9_6_CircleWithStaticMembers c1 = new Eg9_6_CircleWithStaticMembers();

        // display c1 BEFORE c2 is created
        System.out.println("\nAfter creating c1");
        System.out.println("c1: radius (" +
                c1.radius + ") and number of circle objects (" +
                c1.numberOfObjects + ")");

        // create c2
        Eg9_6_CircleWithStaticMembers c2 = new Eg9_6_CircleWithStaticMembers(5);

        // modify c1
        c1.radius = 9;

        // display c1 and c2 AFTER c2 was created
        System.out.println("\nAfter creating c2 and modifying c1");
        System.out.println("c1: radius (" +
                c1.radius + ") and number of circle objects (" +
                c1.numberOfObjects + ")");
        System.out.println("c2: radius (" +
                c2.radius + ") and number of circle objects (" +
                c2.numberOfObjects + ")");

    }
}
