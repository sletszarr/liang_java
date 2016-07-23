package chapter10;

/**
 * Created by bnamora on 7/23/16.
 */
public class Eg10_6_Course {

    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Eg10_6_Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents++] = student;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

}
