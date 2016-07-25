package mylib;

/**
 * Created by bnamora on 7/24/16.
 */

public class Course {


    private String courseName;
    private String[] students;
    private int numberOfStudents;
    public static final int MINIMUM_STUDENT = 3;


    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[MINIMUM_STUDENT];
    }

    public void addStudent(String std) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[5 * std.length()];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents++] = std;
    }

    public void dropStudent(String std) {
        // delete students
        int droppedIndex = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null)
                break;
                
            if (students[i].equals(std)) {
                students[i] = null;
                droppedIndex = i;
            }
        }

        // rearrange array
        if (droppedIndex != -1) {
            for (int i = droppedIndex; i < students.length - 1; i++)
                students[i] = students[i + 1];
        }

    }

    public void clear() {
        for (int i = 0; i < students.length; i++)
            students[i] = null;
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
