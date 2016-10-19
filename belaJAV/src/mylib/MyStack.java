package mylib;

import java.util.ArrayList;

/**
 * Created by bnamora on 10/18/16.
 */

public class MyStack extends ArrayList {

    public MyStack() {
    }

    public Object peek() {
        return this.get(this.size() - 1);
    }

    public Object pop() {
        Object o = this.get(this.size() - 1);
        this.remove(this.size() - 1);
        return o;
    }

    public void push(Object o) {
        this.add(o);
    }

}
