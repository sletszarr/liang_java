package Chapter11;

import java.util.ArrayList;

/**
 * Created by bnamora on 8/2/16.
 */

public class Eg11_8_TestArrayList {

    public static void main(String[] args) {

        ArrayList<String> cityList = new ArrayList<String>();

        cityList.add("London");
        System.out.println(cityList);
        cityList.add("Denver");
        System.out.println(cityList);
        cityList.add("Paris");
        System.out.println(cityList);
        cityList.add("Miami");
        System.out.println(cityList);
        cityList.add("Seoul");
        System.out.println(cityList);
        cityList.add("Tokyo");
        System.out.println(cityList);

        System.out.println("List size: " + cityList.size());
        System.out.println("Is Miami in the list? " +
                cityList.contains("Miami"));
        System.out.println("The location of Denver in this list is: " +
                cityList.indexOf("Denver"));
        System.out.println("Is this list empty? " +
                cityList.isEmpty());

        // insert to index
        System.out.println("\nBefore insertion:");
        System.out.println(cityList);
        cityList.add(2, "Xian");
        System.out.println("After insertion:");
        System.out.println(cityList);

        // remove content
        System.out.println("\nBefore removal:");
        System.out.println(cityList);
        cityList.remove("Miami");
        System.out.println("After removal:");
        System.out.println(cityList);

        // remove at index
        System.out.println("\nBefore removal:");
        System.out.println(cityList);
        cityList.remove(1);
        System.out.println("After removal:");
        System.out.println(cityList);

        // display in reverse order
        System.out.println("\nDisplay in reverse order");
        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print((i == cityList.size() - 1) ? "[" : ", ");
            System.out.print(cityList.get(i));
            System.out.print((i == 0) ? "]" : "");
        }

        // array list of circle
        ArrayList<Eg11_2_Circle> list = new ArrayList<Eg11_2_Circle>();

        // add two circles
        list.add(new Eg11_2_Circle(2));
        list.add(new Eg11_2_Circle(3));

        // display the area of the first circle in the list
        System.out.println("\n\nThe area of the circle is: " +
                list.get(0).getArea());

    }
}
