package chapter10.Eg10_56_CourseClass;

/**
 * Created by bnamora on 7/23/16.
 */

public class TestCourse {

    public static void main(String[] args) {

        // create course
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        // add student to course1
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        // add student to course2
        course2.addStudent("Peter Jones");
        course2.addStudent("Steven Smith");

        // display course1's summary
        System.out.println("Number of students in course 1: " +
                course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }

        // display course2's summary
        System.out.println("\nNumber of students in course 2: " +
                course2.getNumberOfStudents());
        students = course2.getStudents();
        for (int i = 0; i < course2.getNumberOfStudents(); i++) {
            System.out.println(students[i]);
        }
    }

}
