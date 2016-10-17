package mylib;

import java.util.Date;

/**
 * Created by bnamora on 10/17/16.
 */

public class GeometricObject {

    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricObject() {
        this.color  = "White";
        this.filled = true;
        this.dateCreated = new Date();
    }

    public GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreated = new Date();
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

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + "\nfilled: " + filled;
    }
}
