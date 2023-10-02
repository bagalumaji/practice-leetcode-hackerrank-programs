package com.bagal.medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumberII {
    public static void main(String[] args) {
        System.out.println("singleNumber() = " + singleNumber(new int[]{5,2,2,3,2,4,3,4,4,3,2,5,5,6}));
    }
    static int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("map = " + map);

        Map.Entry<Integer, Integer> first = map.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst().get();
        return first.getKey();
    }
}
