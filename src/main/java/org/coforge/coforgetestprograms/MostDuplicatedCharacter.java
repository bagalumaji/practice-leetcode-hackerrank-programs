package org.coforge.coforgetestprograms;

import java.util.HashMap;
import java.util.Map;

public class MostDuplicatedCharacter {
    public static void main(String[] args) {
        String str = "aabbccdddeaa";
        System.out.println(getMostDuplicateCharacter(str));
    }

    static char getMostDuplicateCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        Map.Entry<Character, Integer> entry = map
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get();

        /*
         normal approach
         int count=0;
         char ch=' ';
         for(Map.Entry<Character,Integer> entry: map.entrySet()){
             if(count < entry.getValue()){
                 count = entry.getValue();
                 ch = entry.getKey();
             }
         }
         */
        return entry.getKey();
    }


}
