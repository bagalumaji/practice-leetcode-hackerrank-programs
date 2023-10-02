package com.bagal.coforgetestprograms;

public class Palindrome {
    public static void main(String[] args) {
        String str = "aba";
        if (isPalindrome(str)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is NOT palindrome");
        }
    }

    static boolean isPalindrome1(String str) {
        if (new StringBuffer(str).reverse().toString().equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
