package com.bagal.medium;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        Arrays.sort(strs);
        String firstWord = strs[0];
        String lastWord = strs[strs.length - 1];
        int i;
        for (i=0;i < firstWord.length() && i < lastWord.length();i++) {
            if (firstWord.charAt(i) != lastWord.charAt(i)) {
                break;
            }
        }
        return firstWord.substring(0, i);
    }
}
