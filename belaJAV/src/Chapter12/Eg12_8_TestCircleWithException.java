package Chapter12;

/**
 * Created by bnamora on 1/22/17.
 */

public class Eg12_8_TestCircleWithException {

    public static void main(String[] args) {

        try {
            Eg12_7_CircleWithException c1 = new Eg12_7_CircleWithException(1.9);
            Eg12_7_CircleWithException c2 = new Eg12_7_CircleWithException(-2.9);
            Eg12_7_CircleWithException c3 = new Eg12_7_CircleWithException(5.0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " +
                Eg12_7_CircleWithException.getNumberOfObjects());

    }
}
