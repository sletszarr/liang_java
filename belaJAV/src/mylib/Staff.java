package mylib;

import java.util.Date;

/**
 * Created by bnamora on 10/18/16.
 */
public class Staff extends Employee {

    private String title;

    public Staff() {
        title = "Junior Staff";
    }

    public Staff(String title) {
        this.title = title;
    }

    public Staff(String name,
                 String address,
                 String phoneNumber,
                 String emailAddress,
                 String office,
                 double salary,
                 Date dateHired,
                 String title) {

        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff Class\n Name: " + this.getName();
    }
}
