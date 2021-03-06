package mylib;

/**
 * Created by bnamora on 7/24/16.
 */

public class BMI {

    private String name;
    private int age;
    private double weight; // in pounds
    private double height; // in inches
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCHES = 0.0254;
    public static final double INCHES_PER_FEET = 12;

    public BMI(String name,
               int age,
               double weight,
               double height)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name,
               double weight,
               double height)
    {
        this(name, 20, weight, height);
    }

    public BMI(String name,
               int age,
               double weight,
               double feet,
               double inches)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = feet * INCHES_PER_FEET;
        this.height += inches;
    }

    public double getBMI()
    {
        double bmi = weight * KILOGRAMS_PER_POUND
                / ((height * METERS_PER_INCHES) * (height * METERS_PER_INCHES));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus()
    {
        double bmi = getBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal";
        } else if (bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }
}
