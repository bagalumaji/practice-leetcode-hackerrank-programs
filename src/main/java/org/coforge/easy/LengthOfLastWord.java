package org.coforge.easy;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "Hello Worldyu";
        System.out.println(lengthOfLastWord(s));
    }

    static int lengthOfLastWord(String s) {
        String[] s1 = s.trim().split(" ");
        return s1[s1.length-1].length();
    }
}
