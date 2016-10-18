package mylib;

import java.util.Date;

/**
 * Created by bnamora on 10/17/16.
 */

public class Employee extends Person {

    private String office;
    private double salary;
    private Date dateHired;

    public Employee() {
        office = "shared";
        salary = 5000;
        dateHired = new Date();
    }

    public Employee(String office,
                    double salary,
                    Date dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Employee(String name,
                    String address,
                    String phoneNumber,
                    String emailAddress,
                    String office,
                    double salary,
                    Date dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public String toString() {
        return "Employee Class\nName: " + this.getName();
    }

}
