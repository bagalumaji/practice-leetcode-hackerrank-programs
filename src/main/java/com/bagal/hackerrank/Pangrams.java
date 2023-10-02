package com.bagal.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {
    public static void main(String[] args) {
        System.out.println(pangrams("The quick brown fox jumps over the lazy dog"));
    }
    public static String pangrams(String s) {
        s = s.toLowerCase();
        Set<Character> alphabet = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet.add(c);
            }
        }

        return alphabet.size() == 26 ? "pangram" : "not pangram";
    }
}
