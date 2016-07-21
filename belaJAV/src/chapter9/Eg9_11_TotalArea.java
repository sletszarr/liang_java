package chapter9;

/**
 * Created by bnamora on 7/21/16.
 */

public class Eg9_11_TotalArea {

    public static void main(String[] args) {

        // declare circle array
        Eg9_8_CircleWithPrivateDataFields[] circleArray;

        // create circle array
        circleArray = createCircleArray();

        // print circle array
        printCircleArray(circleArray);
    }

    public static Eg9_8_CircleWithPrivateDataFields[] createCircleArray() {

        Eg9_8_CircleWithPrivateDataFields[] circleArray =
                new Eg9_8_CircleWithPrivateDataFields[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] =
                    new Eg9_8_CircleWithPrivateDataFields(
                            Math.random() * 100
                    );
        }

        return circleArray;
    }

    public static void printCircleArray(
            Eg9_8_CircleWithPrivateDataFields[] circleArray) {

        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n",
                    circleArray[i].getRadius(),
                    circleArray[i].getArea());
        }

        System.out.println("---------------------------------------------");

        // compute and display result
        System.out.printf("%-30s%-15f",
                "The total area of circle is",
                sum(circleArray));
    }

    public static double sum(
            Eg9_8_CircleWithPrivateDataFields[] circleArray) {

        double sum = 0;

        for (Eg9_8_CircleWithPrivateDataFields circle : circleArray) {
            sum += circle.getArea();
        }

        return sum;
    }
}
