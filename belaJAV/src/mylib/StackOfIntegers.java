package mylib;

/**
 * Created by bnamora on 7/23/16.
 */

public class StackOfIntegers {

    private int[] elements;
    private int size;
    public static final int DEFAUL_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAUL_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[2 * elements.length];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int peek() {
        if (!isEmpty())
            return elements[size - 1];

        return 0;
    }

    public int pop() {
        if (!isEmpty())
            return elements[--size];

        return 0;
    }

    public int getSize() {
        return size;
    }

}
