package org.coforge.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static String findLongestSubstring(String str) {
        int n = str.length();
        int maxLength = 0;
        String longestSubstring = "";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
             if (!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
                maxLength = Math.max(maxLength, set.size());
            } else {
                  set.remove(str.charAt(i - maxLength));
            }
        }

        return longestSubstring;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        String longestSubstring = findLongestSubstring(str);
        System.out.println("The longest substring without repeating characters is: " + longestSubstring);
    }
}
