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

    public static String[] split(String s, String dlm) {

        // declare delimiter array
        char[] delimiter;

        // get delimiters
        if (dlm.length() == 1)
            delimiter = new char[]{dlm.charAt(0)};
        else {
            // get delimiters
            // ignoring'[' and ']'
            delimiter = new char[dlm.length() - 2];
            for (int i=0,k = 1; k < dlm.length() - 1; i++,k++)
                delimiter[i] = dlm.charAt(k);
        }

        // declare splits array
        String[] splits = new String[s.length()];
        int index = 0;

        // initialize substring
        String substring= "";

        // get substring
        for (int i = 0; i < s.length(); i++) {

            // initialize flag
            boolean iIsADelimiter = false;
            char currentDelimiter = 0;

            // check whether s[i]
            // is a delimiter
            for (char d : delimiter) {
                if (s.charAt(i) == d) {
                    iIsADelimiter = true;
                    currentDelimiter = d;
                    break;
                }
            }

            // if s[i] is a delimiter
            if (iIsADelimiter) {
                if (substring.length() != 0) {
                    splits[index++] = substring;
                    substring = "";
                }
                splits[index++] = currentDelimiter + "";
            }
            else{
                // concatenate s[i] to substring
                substring += s.charAt(i);

                // if this is the end of string s
                if (i == s.length() - 1)
                    splits[index++] = substring;
            }
        }

        // return a new string array
        // with total generated sub-strings
        // as length
        String[] str = new String[index];
        System.arraycopy(splits, 0, str, 0, index);

        return str;
    }

}
