package com.bagal.array;

import java.util.HashMap;
import java.util.Map;

public class PairWithSumXAndReturnIndex {
    public static Map<Integer, Integer> findPairWithSumX(int[] array, int target) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < array.length; i++)  {
            map1.put(array[i],i);
        }
        for (int i = 0; i < array.length; i++) {
            int diff= target- array[i];
            if(map1.containsKey(diff)){
                if(!map2.containsKey(array[i]) && !map2.containsValue(diff)){
                    map2.put(i,map1.get(diff));
                }
            }
        }
        return map2;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int X = 9;
        System.out.println(findPairWithSumX(array, X));
    }


}