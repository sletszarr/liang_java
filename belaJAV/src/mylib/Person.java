package mylib;

/**
 * Created by bnamora on 10/17/16.
 */

public class Person {

    private String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;

    public Person() {
        name = "Steve Jobs";
        address = "1 Infinite Loop";
        phoneNumber = "1882928282";
        emailAddress = "steve@apple.com";
    }

    public Person(String name,
                  String address,
                  String phoneNumber,
                  String emailAddress) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Person Class\nName: " + this.name;
    }
}
