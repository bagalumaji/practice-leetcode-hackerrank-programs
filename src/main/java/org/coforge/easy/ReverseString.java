package org.coforge.easy;

public class ReverseString {
    public static void main(String[] args) {
        char [] ch = {'h','e','l','l','o'};

        reverseString(ch);
        for(char c:ch)
            System.out.print(c);

        System.out.println();
    }
    static void reverseString(char[] s) {
        int start= 0;
        int end = s.length-1;
        while (start<=end){
            char t = s[start];
            s[start] = s[end];
            s[end] = t;
            start++;
            end--;
        }
    }
}
