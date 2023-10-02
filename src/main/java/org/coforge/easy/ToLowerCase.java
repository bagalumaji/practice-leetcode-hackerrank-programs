package org.coforge.easy;

public class ToLowerCase {
    public static void main(String[] args) {

    }
    static String toLowerCase(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        return s.toLowerCase();
    }
}
