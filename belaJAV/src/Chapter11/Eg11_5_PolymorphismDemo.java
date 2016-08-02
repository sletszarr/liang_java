package Chapter11;

/**
 * Created by bnamora on 8/2/16.
 */

public class Eg11_5_PolymorphismDemo {

    public static void main(String[] args) {

        displayObject(new Eg11_2_Circle(1, "red", false));
        displayObject(new Eg11_3_Rectangle(1, 1, "black", true));
    }

    public static void displayObject(Eg11_1_GeometricObject object) {
        System.out.println("Created on " +
                        object.getDateCreated() +
                        ". Color is " +
                        object.getColor());
    }
}
