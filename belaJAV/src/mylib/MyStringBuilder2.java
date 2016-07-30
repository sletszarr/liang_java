package mylib;

/**
 * Created by bnamora on 7/30/16.
 */

public class MyStringBuilder2 {

    private char[] chars;
    public static int DEFAULT_SIZE = 16;
    private int length;

    public MyStringBuilder2() {
        chars = new char[DEFAULT_SIZE];
    }

    public MyStringBuilder2(char[] chars) {

        // initialize this.chars[]
        this.chars = new char[DEFAULT_SIZE];

        // push all contents of chars[]
        // to this.chars[]
        for (char ch : chars)
            push(ch);
    }

    public MyStringBuilder2(String s) {
        this(s.toCharArray());
    }

    public MyStringBuilder2 insert(int offset, MyStringBuilder2 msb) {

        // get the tail of this.chars[]
        // starting from offset index
        char[] tail = getTail(offset);

        // get the content of msb.chars[]
        char[] msbContent = new char[msb.length];
        System.arraycopy(
                msb.chars, 0,
                msbContent, 0,
                msb.length);

        // push msb.chars to this.chars
        // from offset index
        push(offset, msbContent);

        // append the tail
        // (if there's one)
        if (tail != null) {
            for (char ch : tail)
                push(ch);
        }

        return this;
    }

    public MyStringBuilder2 reverse() {
        int lo = 0;
        int hi = length - 1;

        while (lo < hi) {
            // swap chars[lo]
            // with chars[hi]
            char temp = chars[lo];
            chars[lo] = chars[hi];
            chars[hi] = temp;

            // increase lo
            // decrease hi
            lo++;
            hi--;
        }

        return this;
    }

    public MyStringBuilder2 substring(int begin) {

        // get substring of this.chars[]
        // starting from begin index
        char[] substr = getTail(begin);

        // if there's a substring
        if(substr!=null)
            return new MyStringBuilder2(substr);

        return null;
    }

    public MyStringBuilder2 toUpperCase() {

        for (int i = 0; i < length; i++) {
            if ('a' <= chars[i] && chars[i] <= 'z')
                chars[i] += 'A' - 'a';
        }

        return this;
    }

    public String toString() {

        String str = "";

        for (int i = 0; i < length; i++)
            str += chars[i];

        return str;
    }

    private char[] getTail(int offset) {

        // if there's no tail
        if (offset >= length)
            return null;

        // make sure offset
        // is not smaller than 0
        offset = (offset < 0)
                ? 0
                : offset;

        // get the tail of this.chars[]
        // starting from offset index
        char[] tail = new char[this.length - offset];
        System.arraycopy(
                this.chars, offset,
                tail, 0,
                tail.length);

        return tail;
    }

    private void push(int offset, char[] chars) {

        // make sure offset
        // is not greater than this.length
        // and not smaller than 0
        offset = (offset >= length)
                ? length :
                (offset < 0)
                        ? 0
                        : offset;

        // as ch now will be push
        // from offset index,
        // then,
        // this.length must be reset
        // to offset index
        length = offset;

        // push contents in chars[]
        // to this.chars[]
        for (char ch : chars)
            push(ch);
    }

    private void push(char ch) {

        // if length has reach max
        // increase this.chars[]'s size
        if (length >= chars.length) {
            char[] temp = new char[2 * length];
            System.arraycopy(chars, 0, temp, 0, length);
            chars = temp;
        }

        // push ch to this.chars[]
        chars[length++] = ch;
    }


}
