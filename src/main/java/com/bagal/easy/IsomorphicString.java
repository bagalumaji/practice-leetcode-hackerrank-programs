package com.bagal.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "badc";
        String t = "kikp";
        int a=10,b=20;

        a = (a+b)-(b = a);
        System.out.println(a+" : "+b);
        //System.out.println(isIsomorphic(s, t));
        //test();
    }

    static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            char s2 = t.charAt(i);

            if (!map.containsKey(s1)) {
                if (!map.containsValue(s2)) {
                    map.put(s1, s2);
                } else {
                    return false;
                }
            } else {
                char c = map.get(s1);
                if (c != s2)
                    return false;
            }
        }
        return true;
    }


}
