package mylib;

import java.util.Date;

/**
 * Created by bnamora on 10/17/16.
 */
public class Faculty extends Employee {

    private int officeHours;
    private String rank;

    public Faculty() {
        officeHours = 8;
        rank = "Lecturer";
    }

    public Faculty(int officeHours, String rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Faculty(String name,
                   String address,
                   String phoneNumber,
                   String emailAddress,
                   String office,
                   double salary,
                   Date dateHired,
                   int officeHours,
                   String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty Class\nName: " + this.getName();
    }
}
