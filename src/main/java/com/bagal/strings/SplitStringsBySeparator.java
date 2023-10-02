package com.bagal.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SplitStringsBySeparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one.two.three","four.five. .","six");
        System.out.println("splitWordsBySeparator(list,'.') = " + splitWordsBySeparator(list, '.'));
    }
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {

        List<String> result = new ArrayList<>();
        for (String word : words) {
            for (String w : word.replace(separator,',').split(",")) {
                if(!w.isBlank())
                 result.add(w);
            }
        }
        return result;
    }
}
