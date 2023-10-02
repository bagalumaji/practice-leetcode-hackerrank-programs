package org.coforge.strings;

import java.util.*;

public class SortVowelsInAString {
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }
    public static String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        List<Integer> positions = new ArrayList<>();
        Set<Character> vow = new HashSet<>(Arrays.asList('a','e','o','i','u','A','U','I','E','O'));
        char [] v = s.toCharArray();
        for (int i = 0; i <s.length(); i++) {
            if(vow.contains(s.charAt(i))){
                vowels.add(s.charAt(i));
                positions.add(i);
            }
        }

        Collections.sort(vowels);
        for (int i = 0; i < positions.size(); i++) {
            v[positions.get(i)] = vowels.get(i);
        }

        return new String(v);
    }
}
