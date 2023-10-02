package org.coforge.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestNonRepeatingSubString1 {
    public static void main(String[] args) {
        String  str="abcabcbb";
        Set<Character> ls = new HashSet<>();
        int max=0;
        int start = 0;
        int end=0;
        while (end!=str.length()){
            if(!ls.contains(str.charAt(end))){
                ls.add(str.charAt(end));
                end++;
                max = Math.max(ls.size(),max);
            }else {
                ls.remove(str.charAt(start));
                start++;
            }
        }
        System.out.println("max = " + max);
    }
}
