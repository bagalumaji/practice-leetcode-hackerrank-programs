package com.bagal.coforgetestprograms;

import java.util.Set;

public class VowelOrConsonant {
    public static void main(String[] args) {
        String str = "abcd";
        Set<Character> vowels = Set.of('a', 'e', 'i', 'u', 'o');

        for (char ch : str.toCharArray()) {
            if (checkCharacterIsVowelOrConsonant(ch, vowels)) {
                System.out.println(ch + " is vowel");
            } else {
                System.out.println(ch + " is consonant");
            }
        }
    }

    static boolean checkCharacterIsVowelOrConsonant(char ch, Set<Character> vowels) {
        return vowels.contains(Character.toLowerCase(ch));
    }
}
