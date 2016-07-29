package mylib;

/**
 * Created by bnamora on 7/29/16.
 */

public class MyString2 {

    private String s;

    public MyString2(String s) {
        this.s = s;
    }

    public int compare(String s) {

        int minLength = Math.min(this.s.length(), s.length());

        for (int i = 0; i < minLength; i++){
            if (this.s.charAt(i) < s.charAt(i))
                return 1;
            else if (this.s.charAt(i) > s.charAt(i))
                return -1;
        }

        return 0;
    }

    public MyString2 substring(int begin) {
        String str = "";

        for (int i = begin; i < s.length(); i++) {
            str += s.charAt(i);
        }

        return new MyString2(str);
    }

    public MyString2 toUpperCase() {
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                str += (char) (s.charAt(i) - ('a' - 'A'));
            else
                str += s.charAt(i);
        }

        return new MyString2(str);
    }

    public char[] toChars() {
        char[] str = new char[s.length()];
        for (int i = 0; i < str.length; i++) {
            str[i] = s.charAt(i);
        }
        return str;
    }

    public static MyString2 valueOf(boolean b) {
        return new MyString2(Boolean.toString(b));
    }

    public void print() {
        System.out.println(s);
    }

}
