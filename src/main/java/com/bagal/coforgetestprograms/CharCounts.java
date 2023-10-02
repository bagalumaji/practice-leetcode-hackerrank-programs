package com.bagal.coforgetestprograms;

import java.util.HashMap;
import java.util.Map;

public class CharCounts {
    public static void main(String[] args) {
        String str ="abcddeecb";
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        System.out.println("map = " + map);
    }
}
