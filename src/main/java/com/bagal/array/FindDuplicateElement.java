package com.bagal.array;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) {
        System.out.println(getDuplicateElement(new int[]{1,2,2,3,1,4,3}));
    }
    static int getDuplicateElement(int [] nums){
        Set<Integer> set = new HashSet<>();
        int d=0;
        for(int a:nums){
            if(!set.add(a)){
                d = a;
                break;
            }
        }
        return d;
    }
}
