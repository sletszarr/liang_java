package Chapter11;

import java.util.ArrayList;

/**
 * Created by bnamora on 8/2/16.
 */

public class Eg11_10_MyStack {

    private ArrayList<Object> list = new ArrayList<Object>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(list.size() - 1);
    }

    public Object pop() {
        Object o = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return o;
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

}
