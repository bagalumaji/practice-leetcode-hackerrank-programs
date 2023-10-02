package org.coforge.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println("demo(digits) = " + demo(digits));

    }

    static List<String> demo(String digits) {
        Map<String, String>  keys= Map.of("2", "abc", "3", "def", "4", "ghi", "5", "jkl", "6", "mno", "7", "pqrs", "8", "tuv", "9", "wxyz");

        List<String> k = new ArrayList<>();
        for (int i = 0; i <digits.length(); i++) {
            if(keys.containsKey(digits.charAt(i)+"")) {
                k.add(keys.get(digits.charAt(i)+""));
            }
        }
        return k;
    }
}
