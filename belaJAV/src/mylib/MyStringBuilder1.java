package mylib;

/**
 * Created by bnamora on 7/30/16.
 */

public class MyStringBuilder1 {

    private char[] chars;
    public static int DEFAULT_SIZE = 16;
    private int length;

    public MyStringBuilder1(String s) {

        // initialize this.chars
        chars = new char[DEFAULT_SIZE];

        // push all chars in s
        // to this.chars[]
        for (int i = 0; i < s.length(); i++)
            push(s.charAt(i));
    }

    public MyStringBuilder1 append(MyStringBuilder1 sb) {

        // push all elements in sb.chars[]
        // to this.chars[]
        for (int i = 0; i < sb.length; i++)
            push(sb.chars[i]);

        return this;
    }

    public MyStringBuilder1 append(int n) {

        // push char representation of i
        char[] nums = new char[10];
        int numCount = 0;

        // push n to nums[]
        for (int i = nums.length - 1; i >= 0; i--) {

            // push the last digit of n
            // to the last index of nums[]
            char nch = (char)(n % 10 + '0');
            nums[i] = nch;

            // increase num counter
            numCount++;

            // divide n
            n /= 10;

            // until 0
            if (n == 0) break;
        }

        // push contents of nums[]
        // to this.chars[]
        for (int i = nums.length - numCount; i < nums.length; i++)
            push(nums[i]);

        return this;
    }

    public int length() {
        return length;
    }

    public char charAt(int index) {

        if (0 <= index && index <= length)
            return chars[index];

        return 0;
    }

    public MyStringBuilder1 toLowerCase() {

        for (int i = 0; i < length; i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z')
                chars[i] += ('a' - 'A');
        }

        return this;
    }

    public MyStringBuilder1 substring(int begin, int length) {

        String str = "";

        // concatenate chars[i]
        // from begin to length-1
        for (int i = begin; i < length; i++)
            str += chars[i];

        return new MyStringBuilder1(str);
    }

    public String toString() {

        String str = "";

        // concatenate every char
        // in this.chars[] to str
        for (int i = 0; i < length; i++)
            str += chars[i];

        return str;
    }

    private void push(char ch) {

        // when length is equals
        // to chars[].length
        // increase chars[]'s size
        if (this.length >= chars.length) {
            char[] temp = new char[2 * length];
            System.arraycopy(chars, 0, temp, 0, length);
            chars = temp;
        }

        chars[length++] = ch;
    }

}
