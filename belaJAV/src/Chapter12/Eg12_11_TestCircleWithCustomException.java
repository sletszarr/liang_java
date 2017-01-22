package Chapter12;

/**
 * Created by bnamora on 1/22/17.
 */

public class Eg12_11_TestCircleWithCustomException {

    public static void main(String[] args) {

        try {
            new CircleWithCustomException(5.0);
            new CircleWithCustomException(-1.9);
            new CircleWithCustomException(0);
        }
        catch (Eg12_10_InvalidRadiusException ex) {
            System.out.println(ex);
        }

        System.out.println("Number of objects created: " +
                CircleWithCustomException.getNumberOfObjects());

    }

}

class CircleWithCustomException{

    private double radius;

    private static int numberOfObjects = 0;

    public CircleWithCustomException()
            throws Eg12_10_InvalidRadiusException{

        this(1.0);
    }

    public CircleWithCustomException(double radius)
            throws Eg12_10_InvalidRadiusException{

        setRadius(radius);
        numberOfObjects++;
    }

    public void setRadius(double radius)
            throws Eg12_10_InvalidRadiusException {

        if (radius >= 0) {
            this.radius = radius;
        }
        else
            throw new Eg12_10_InvalidRadiusException(radius);
    }

    public double getRadius() {
        return radius;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

}
