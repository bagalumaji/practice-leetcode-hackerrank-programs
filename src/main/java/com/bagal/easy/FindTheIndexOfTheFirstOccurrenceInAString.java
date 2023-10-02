package com.bagal.easy;

public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack = "saadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    static int strStr(String haystack, String needle) {
            return haystack.indexOf(needle);
    }
}
