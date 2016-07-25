package chapter10;

import mylib.Course;

/**
 * Created by bnamora on 7/24/16.
 */

public class Ex10_9_TestUpgradedCourseClass {

    public static void main(String[] args) {

        // create course object
        Course course = new Course("Mobile App Design");

        // add student
        course.addStudent("Baginda Namora");
        course.addStudent("Dimas Wahyu");
        course.addStudent("Julius Kencana");
        course.addStudent("Lechsa Pardomuando");
        displayStudent(course.getStudents());

        // remove student
        course.dropStudent("Julius Kencana");
        displayStudent(course.getStudents());

        // clear all student
        course.clear();
        displayStudent(course.getStudents());
    }

    public static void displayStudent(String[] students) {
        System.out.println("\nStudents:");
        for (String std : students) {
            if (std == null)
                break;
            System.out.println(std);
        }

    }

}
