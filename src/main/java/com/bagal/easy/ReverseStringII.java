package com.bagal.easy;

public class ReverseStringII {
    public static void main(String[] args) {
        String  s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
    static String reverseStr(String s, int k) {
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder sb = new StringBuilder(s.substring(0,k));
        sb.reverse();
        int i=k;
        while(i<s.length()){
        }
        return  sb.toString();
    }
}
