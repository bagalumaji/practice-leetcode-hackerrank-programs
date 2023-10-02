package org.coforge.strings;

import java.util.HashMap;
import java.util.Map;

public class MakeSmallestPalindromeLeetCode {
    public static void main(String[] args) {
        String str = "egcfe";
        System.out.println(makeSmallestPalindrome1(str));
    }

    static String makeSmallestPalindrome1(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            char c = (char) Math.min((int) s.charAt(i), (int) s.charAt(s.length() - 1 - i));
            s = s.substring(0, i) + c + s.substring(i + 1, s.length() - i - 1) + c + s.substring(s.length() - i);
        }
        return s;
    }
    static String makeSmallestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        boolean f = true;
        for (char ch : map.keySet()) {
            int cnt = map.get(ch);
            if (cnt % 2 == 1) {
                if (f) {
                    sb.insert(sb.length() / 2, ch);
                    f = false;
                }
                cnt--;
            }
            for (int i = 0; i < cnt / 2; i++) {
                sb.insert(0, ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
