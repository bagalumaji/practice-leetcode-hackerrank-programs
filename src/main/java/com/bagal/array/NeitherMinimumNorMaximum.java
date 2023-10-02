package com.bagal.array;

import java.util.Arrays;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        int []a ={2,1,3};
        System.out.println(findNonMinOrMax(a));
    }
    public static int findNonMinOrMax(int[] nums) {
        if(nums.length<3)
            return -1;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }


        if(nums.length >2)
            return nums[1];

        return nums[1];
    }
}
