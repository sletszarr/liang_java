package Chapter11;

/**
 * Created by bnamora on 8/2/16.
 */

public class Eg11_6_DynamicBindingDemo {

    public static void main(String[] args) {

        m(new Eg11_6_GraduateStudent());
        m(new Eg11_6_Student());
        m(new Eg11_6_Person());
        m(new Object());

    }

    public static void m(Object x) {
        System.out.println(x.toString());
    }

}

class Eg11_6_GraduateStudent
        extends Eg11_6_Student {
}

class Eg11_6_Student
        extends Eg11_6_Person {
    @Override
    public String toString() {
        return "Student";
    }
}

class Eg11_6_Person {
    @Override
    public String toString() {
        return "Person";
    }
}

