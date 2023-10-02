package com.bagal.easy;

import java.util.*;

public class SingleNumber {
    public static void main(String[] args) {
        System.out.println("singleNumber() = " + singleNumber(new int[]{5,2,3,4,4,3,2}));
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
