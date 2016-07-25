package mylib;

/**
 * Created by bnamora on 7/24/16.
 */

public class Queue {

    public static int DEFAULT_CAPACITY = 8;
    private int[] elements;
    private int size;
    private int head;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        elements = new int[capacity];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[2 * elements.length];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        if (head != 0 && head == size / 2) {
            for (int i = 0, k = head; k <= size; i++, k++) {
                elements[i] = elements[k];
            }
            size -= head;
            head = 0;
        }
        return elements[head++];
    }

    public boolean isEmpty() {
        return head == size;
    }

    public int getSize() {
        return size - head;
    }

}
