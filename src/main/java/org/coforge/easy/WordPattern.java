package org.coforge.easy;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));
    }

    static boolean wordPattern(String pattern, String s) {
       String [] words = s.split(" ");
       if(words.length != pattern.length()) return false;

       Map<Character,String> charString  = new HashMap<>();
       Map<String,Character> strCharacter = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            char ch = pattern.charAt(i);

            if(!charString.containsKey(ch)){
                charString.put(ch,str);
            }
            if(!strCharacter.containsKey(str)){
                strCharacter.put(str,ch);
            }

            if(!charString.get(ch).equals(str) || strCharacter.get(str).equals(ch) )
                return false;
        }
        return true;
    }

}
