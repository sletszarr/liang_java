package mylib;

/**
 * Created by bnamora on 10/17/16.
 */

public class Student extends Person {

    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;
    private int classStatus;

    public Student() {
        classStatus = FRESHMAN;
    }

    public Student(int classStatus) {
        this.classStatus = classStatus;
    }

    public Student(String name,
                   String address,
                   String phoneNumber,
                   String emailAddress,
                   int classStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }

    public int getClassStatus() {
        return classStatus;
    }

    public void setClassStatus(int classStatus) {
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        return "Student Class\nName: " + this.getName();
    }
}
