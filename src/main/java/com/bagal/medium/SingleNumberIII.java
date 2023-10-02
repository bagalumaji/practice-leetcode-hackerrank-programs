package com.bagal.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SingleNumberIII {
    public static void main(String[] args) {
        int[] singleNum = singleNumber(new int[]{1, 2, 1, 3, 2, 5});
        for (int i : singleNum) {
            System.out.println(i);
        }
    }
    static int[] singleNumber(int[] nums) {
        if (nums.length == 2)
            return nums;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = map.entrySet().stream().filter(e -> e.getValue() == 1).collect(Collectors.toList());

        int  [] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i).getKey();
        }

        return res;
    }
}
