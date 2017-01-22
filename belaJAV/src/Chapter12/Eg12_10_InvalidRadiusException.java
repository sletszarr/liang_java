package Chapter12;

/**
 * Created by bnamora on 1/22/17.
 */

public class Eg12_10_InvalidRadiusException
        extends Exception{

        private double radius;

        public Eg12_10_InvalidRadiusException(double radius) {
                super("Invalid radius " + radius +" (radius can't be negative)");
                this.radius = radius;
        }

        public double getRadius() {

                return radius;
        }

}
