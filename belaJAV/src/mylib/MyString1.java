package mylib;

/**
 * Created by bnamora on 7/29/16.
 */

public class MyString1 {

    private char[] chars;

    public MyString1(char[] chars) {
        this.chars = new char[chars.length];
        System.arraycopy(chars, 0, this.chars, 0, chars.length);
    }

    public char charAt(int index) {
        return this.chars[index];
    }

    public int length() {
        return this.chars.length;
    }

    public MyString1 substring(int begin, int end) {

        // prepare chars
        // for new MyString1 object
        int length = end - begin;
        char[] ch = new char[length];

        // copy this.char [begin -> (end-1)]
        // to ch[0 -> length]
        for (int i = 0, k = begin; k < end; i++, k++) {
            ch[i] = this.chars[k];
        }

        // return a new MyString1 object
        return new MyString1(ch);
    }

    public MyString1 toLowerCase() {

        // copy this.char to a new ch
        char[] ch = new char[this.chars.length];
        System.arraycopy(this.chars, 0, ch, 0, ch.length);

        for (int i = 0; i < ch.length; i++) {
            if (65 <= ch[i] && ch[i] <= 90) {
                ch[i] += ('a' - 'A');
            }
        }

        return new MyString1(ch);
    }

    public boolean equals(MyString1 s) {
        for (int i = 0; i < this.chars.length; i++) {
            if (this.chars[i] != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static MyString1 valueOf(int num) {
        // prepare char array
        // with the length of maximal int digit
        char[] numString = new char[10];

        // initialize num length counter
        int numLength = 0;

        for (int i = numString.length - 1; i >= 0; i--) {
            // get char representation of
            // every num digit from right to left
            numString[i] = (char) ((num % 10) + '0');
            num /= 10;

            // increase length counter
            numLength++;

            // if num is 0
            // then it has reach
            // the left-most digit
            if (num == 0)
                break;
        }

        // prepare char with
        // the exact size of num
        char[] string = new char[numLength];

        // copy numString to num
        System.arraycopy(numString,
                numString.length - numLength,
                string,
                0,
                numLength);

        // return a new MyString1 object
        return new MyString1(string);
    }

    public void print() {
        for (char c : this.chars)
            System.out.print(c);
        System.out.println();
    }

}
