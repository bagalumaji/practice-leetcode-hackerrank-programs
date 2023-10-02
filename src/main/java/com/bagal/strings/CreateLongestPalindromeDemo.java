package com.bagal.strings;

import java.util.HashMap;
import java.util.Map;

public class CreateLongestPalindromeDemo {
    public static void main(String[] args) {
        String inputString = "abcdeaf"; // Replace with your input string

        String longestPalindrome = findLongestPalindrome(inputString);
        System.out.println("Longest palindrome substring: " + longestPalindrome);
    }

    public static String findLongestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder palindrome = new StringBuilder();
        boolean oddFound = false;

        for (char ch : map.keySet()) {
            int count = map.get(ch);
            if (count % 2 == 1) {
                if (!oddFound) {
                    palindrome.insert(palindrome.length() / 2, ch);
                    oddFound = true;
                }
                count--;
            }
            for (int i = 0; i < count / 2; i++) {
                palindrome.insert(0, ch);
                palindrome.append(ch);
            }
        }

        return palindrome.toString();
    }

}
