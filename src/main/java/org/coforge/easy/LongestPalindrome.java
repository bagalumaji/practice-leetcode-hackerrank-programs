package org.coforge.easy;

import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }

    static int longestPalindrome(String s) {
        int len = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                len += 2;
                set.remove(c);
            }
            else {
                set.add(c);
            }
        }
        if (!set.isEmpty()) {
            len++;
        }
        return len;
    }
}

