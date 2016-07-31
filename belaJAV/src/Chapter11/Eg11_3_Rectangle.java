package Chapter11;

/**
 * Created by bnamora on 7/31/16.
 */

public class Eg11_3_Rectangle
        extends Eg11_1_GeometricObject {

    private double width;
    private double height;

    public Eg11_3_Rectangle() {
    }

    public Eg11_3_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Eg11_3_Rectangle(double width, double height,
                            String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}


