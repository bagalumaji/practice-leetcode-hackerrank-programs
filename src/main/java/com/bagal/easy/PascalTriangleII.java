package com.bagal.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }
    static List<Integer> getRow(int rowIndex) {
        List<List<Integer>>vector = new ArrayList<>();
        List<Integer> addOne = List.of(1);
        vector.add(addOne);
        if (rowIndex==1) {
            return vector.get(0);
        }
        for (int i = 2; i <= rowIndex+1; i++) {
            List<Integer>v = new ArrayList<>();
            v.add(1);
            for (int j = 0; j <i-2; j++) {
                v.add(vector.get(i-2).get(j) + vector.get(i-2).get(j+1));
            }
            v.add(1);
            vector.add(v);
            v=null;
        }
        return vector.get(rowIndex);
    }

}
