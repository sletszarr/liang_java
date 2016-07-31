package Chapter11;

/**
 * Created by bnamora on 7/31/16.
 */

public class Eg11_4_TestCircleRectangle {

    public static void main(String[] args) {

        Eg11_2_Circle circle = new Eg11_2_Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("The area is " + circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Eg11_3_Rectangle rect = new Eg11_3_Rectangle(2, 4);
        System.out.println("\nA rectangle " + rect.toString());
        System.out.println("The area is " + rect.getArea());
        System.out.println("The perimeter is " + rect.getPerimeter());

    }

}
