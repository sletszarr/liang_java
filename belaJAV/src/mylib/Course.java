package mylib;

import java.util.ArrayList;

/**
 * Created by bnamora on 7/24/16.
 */

public class Course {

    private String courseName;
    private ArrayList<String> students;
    public static final int MINIMUM_STUDENT = 3;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }

    public void addStudent(String std) {
        students.add(std);
    }

    public void dropStudent(String std) {
        students.remove(std);
    }

    public void clear() {
        students.clear();
    }

    public String[] getStudents() {
        String[] studentList = new String[students.size()];
        for (int i = 0; i < studentList.length; i++) {
            studentList[i] = students.get(i);
        }
        return studentList;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }
}
