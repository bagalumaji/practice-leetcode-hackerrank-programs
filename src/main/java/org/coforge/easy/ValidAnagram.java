package org.coforge.easy;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "cat", t = "eet";
        System.out.println(isAnagram(s, t));
    }
    static boolean isAnagram(String s, String t) {
        char [] a= s.toCharArray();
         Arrays.sort(a);
         s = new String(a);
         char [] b = t.toCharArray();
         Arrays.sort(b);
         t = new String(b);
         return s.equals(t);
    }

    static boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming only lowercase English letters

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}

