package com.bagal.strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str="ahihellohiabc";
        System.out.println(findLongestPalindrome(str));
        System.out.println(findLongestPalindrome1(str));
    }

    static String findLongestPalindrome1(String str) {
        int cnt = 0;
        String result = "";
        int max = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                String t = str.substring(i, j + 1);
                if (checkPalindrome(t)) {
                    cnt = t.length();
                    if (max < cnt) {
                        max = cnt;
                        result = t;
                    }
                }
            }
        }
        return result;
    }
    static boolean checkPalindrome(String str) {
        return new StringBuilder(str)
                .reverse()
                .toString()
                .equals(str);
    }

    static String preprocessString(String str) {
        StringBuilder sb = new StringBuilder("#");
        for (char ch : str.toCharArray()) {
            sb.append(ch);
            sb.append("#");
        }
        return sb.toString();
    }

    static String findLongestPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }

        String processedStr = preprocessString(str);
        int[] palindromeLengths = new int[processedStr.length()];
        int center = 0, rightBoundary = 0;
        int maxLen = 0, maxCenter = 0;

        for (int i = 0; i < processedStr.length(); i++) {
            int mirror = 2 * center - i;

            if (i < rightBoundary) {
                palindromeLengths[i] = Math.min(rightBoundary - i, palindromeLengths[mirror]);
            }

            int a = i + (1 + palindromeLengths[i]);
            int b = i - (1 + palindromeLengths[i]);

            while (a < processedStr.length() && b >= 0 && processedStr.charAt(a) == processedStr.charAt(b)) {
                palindromeLengths[i]++;
                a++;
                b--;
            }

            if (i + palindromeLengths[i] > rightBoundary) {
                center = i;
                rightBoundary = i + palindromeLengths[i];
                if (palindromeLengths[i] > maxLen) {
                    maxLen = palindromeLengths[i];
                    maxCenter = i;
                }
            }
        }

        int start = (maxCenter - maxLen) / 2;
        int end = start + maxLen;
        return str.substring(start, end);
    }
}

