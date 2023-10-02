package org.coforge.strings;

import java.util.*;

public class FindMaximumNumberOfStringPairs {
    public static void main(String[] args) {
        String[] words = {"cd", "ac", "dc", "ca", "zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }

    public static int maximumNumberOfStringPairs(String[] words) {

        Set<String> reversed = new HashSet<>();
        int cnt = 0;
        for (String s : words) {
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String t = new String(ch);
            System.out.println(t);
            if (!reversed.add(t)) {
                cnt++;
            }
        }

        return cnt;

    }
}
