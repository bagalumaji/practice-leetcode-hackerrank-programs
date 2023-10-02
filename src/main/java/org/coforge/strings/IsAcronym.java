package org.coforge.strings;

import java.util.List;

public class IsAcronym {
    public static void main(String[] args) {
        List<String > strings = List.of("alice","bob","charlie");
        String s="abd";
        System.out.println(isAcronym(strings,s));
    }
    static boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length())
            return false;
        for (int i = 0; i < s.length(); i++) {
            if(words.get(i).charAt(0) != s.charAt(i))
                return false;
        }
        return true;
    }
}
