package org.coforge.strings;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;


public class LongestNonRepeatingSubString {
    public static void main(String[] args) {
        String  str="abcabcbb";
        String result="";
        int cnt=0;
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if(!set.add(str.charAt(j))){
                    break;
                }
            }

            if(cnt<set.size()){
                cnt = set.size();
                result = Arrays.toString(set.toArray());
                // System.out.println("set = " + string.replace("[","").replace("]","").replace(",",""));
            }
            set.clear();
        }
        System.out.println("result = " + result);
    }
}
