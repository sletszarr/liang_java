package Chapter11;

/**
 * Created by bnamora on 8/2/16.
 */

public class Eg11_7_CastingDemo {

    public static void main(String[] args) {

        // create & initialize 2 objects
        Object object1 = new Eg11_2_Circle(1);
        Object object2 = new Eg11_3_Rectangle(1, 1);

        // display circle and rectangle
        displayObject(object1);
        displayObject(object2);

    }

    public static void displayObject(Object obj) {
        if (obj instanceof Eg11_2_Circle) {
            System.out.println("The circle area is " +
                    ((Eg11_2_Circle) obj).getArea());
            System.out.println("The circle diameter is " +
                    ((Eg11_2_Circle) obj).getDiameter());
        }
        else if (obj instanceof Eg11_3_Rectangle) {
            System.out.println("The rectangle area is " +
                    ((Eg11_3_Rectangle) obj).getArea());
        }
    }

}
