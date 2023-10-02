package org.coforge.strings;
import java.util.*;
public class AllLongestPalindromeSubString {
    public static void main(String[] args) {
        String inputString = "abcbab"; // Replace with your input string

        Set<String> palindromes = findPalindromicSubstrings(inputString);
        System.out.println("Palindromic substrings: " + palindromes);
    }

    public static Set<String> findPalindromicSubstrings(String s) {
        Set<String> palindromes = new HashSet<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            // Odd-length palindromes
            expandAroundCenter(s, i, i, palindromes);

            // Even-length palindromes
            expandAroundCenter(s, i, i + 1, palindromes);
        }

        return palindromes;
    }



    public static void expandAroundCenter(String s, int left, int right, Set<String> palindromes) {
        int n = s.length();
        while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
            palindromes.add(s.substring(left, right + 1));
            left--;
            right++;
        }
    }
}