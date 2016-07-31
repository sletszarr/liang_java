package Chapter11;

import java.util.Date;

/**
 * Created by bnamora on 7/31/16.
 */

public class Eg11_1_GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public Eg11_1_GeometricObject() {
        this("white", false);
    }

    public Eg11_1_GeometricObject(String color, boolean filled) {
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated +
                "\ncolor: " + color +
                " and filled: " + filled;
    }
}
