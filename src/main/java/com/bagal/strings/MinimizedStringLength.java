package com.bagal.strings;

import java.util.HashSet;
import java.util.Set;

public class MinimizedStringLength {
    public static void main(String[] args) {
        String s ="aaabc";
        System.out.println(minimizedStringLength(s));
    }
    public static int minimizedStringLength(String s) {
        int cnt=0;
        Set<Character> set  =new HashSet<>();

        for(char ch:s.toCharArray()){
            set.add(ch);
        }
        return set.size();
    }
}
