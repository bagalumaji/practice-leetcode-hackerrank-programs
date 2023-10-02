package com.bagal.easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int i = 0;
        int [] nums ={1,0,2,3,0,6};
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
