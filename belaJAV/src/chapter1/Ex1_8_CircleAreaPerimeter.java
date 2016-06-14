package chapter1;

/**
 * Created by bnamora on 6/7/16.
 *
 * (Area and perimeter of a circle)
 * Write a program that displays the area and perimeter of a circle
 * that has a radius of 5.5 using the following formula:
 *
 *      perimeter = 2 * radius * p
 *      area = radius * radius * p
 *
 */

public class Ex1_8_CircleAreaPerimeter {

    public static void main(String[] args) {

        System.out.println("Radius: 5.5");
        System.out.println("Perimeter: " + 2 * 5.5 * Math.PI);
        System.out.println("Area : " + 5.5 * 5.5 * Math.PI);

    }
}
