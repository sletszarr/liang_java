package Chapter11;

import mylib.Person;
import mylib.Student;
import mylib.Employee;
import mylib.Faculty;
import mylib.Staff;

import java.util.Date;

/**
 * Created by bnamora on 10/18/16.
 */

public class Ex11_2_PersonStudentEmployeeFacultyStaff {

    public static void main(String[] args) {

        Person orang = new Person("Baginda Namora", "Kebon Jeruk", "0808989898", "baginda@namora.com");

        Student mahasiswa = new Student(
                orang.getName(), orang.getAddress(), orang.getPhoneNumber(), orang.getEmailAddress(),
                Student.SENIOR);

        Employee karyawan = new Employee(
                orang.getName(), orang.getAddress(), orang.getPhoneNumber(), orang.getEmailAddress(),
                "corner office", 199000, new Date()
        );

        Faculty faculty = new Faculty(
                orang.getName(), orang.getAddress(), orang.getPhoneNumber(), orang.getEmailAddress(),
                karyawan.getOffice(), karyawan.getSalary(), karyawan.getDateHired(),
                8, "Senior Lecturer"
        );

        Staff staff = new Staff("Chief Executive Officer");

        System.out.println(orang.toString());
        System.out.println(mahasiswa.toString());
        System.out.println(karyawan.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
