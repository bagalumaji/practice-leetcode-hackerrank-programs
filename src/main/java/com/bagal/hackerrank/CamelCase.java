package com.bagal.hackerrank;

public class CamelCase {
    public static void main(String[] args) {
        String str="aaaBbbbbCccc";
        System.out.println(camelcase(str));
    }
    public static int camelcase(String s) {
        int cnt=1;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i)))
                cnt++;
        }
        return cnt;
    }
}
