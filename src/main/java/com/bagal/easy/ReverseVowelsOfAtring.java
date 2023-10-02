package com.bagal.easy;

import java.util.*;

public class ReverseVowelsOfAtring {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(reverseVowels(s));
    }
    static String reverseVowels(String s) {
        if(s.length()<2)
            return s;
        Set<Character> vowels = new HashSet<>(Arrays.asList('A','E','I','O','U','a','e','i','o','u'));
        int start=0, end=s.length()-1;
        char [] ch = s.toCharArray();
        while (start<end){
            if(!vowels.contains(ch[start])){
              start++;
            }
            if (!vowels.contains(ch[end])){
                end--;
            }
            if(vowels.contains(ch[start]) && vowels.contains(ch[end])){
                char c = ch[start];
                ch[start] = ch[end];
                ch[end] = c;
                start++;
                end--;
                c=' ';
            }
        }
        return new String(ch);
    }
}
