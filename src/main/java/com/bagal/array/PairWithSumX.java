package com.bagal.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairWithSumX {
    public static Map<Integer, Integer> findPairWithSumX(int[] array, int target) {
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int element : array) {
            map1.put(element,element);
        }
        for (int ele:array){
            int diff= target- ele;
            if(map1.containsKey(diff)){
                if(!map2.containsKey(ele) && !map2.containsValue(ele)){
                    map2.put(ele,diff);
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