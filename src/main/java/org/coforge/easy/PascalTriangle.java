package org.coforge.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println("generate(3) = " + generate(3));
    }
    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>>vector = new ArrayList<>();
        List<Integer> addOne = List.of(1);
        vector.add(addOne);
        if (numRows==1) {
            return vector;
        }
        for (int i = 2; i <= numRows; i++) {
            List<Integer>v = new ArrayList<>();
            v.add(1);
            for (int j = 0; j <i-2; j++) {
                v.add(vector.get(i-2).get(j) + vector.get(i-2).get(j+1));
            }
            v.add(1);
            vector.add(v);
            v=null;
        }
        return vector;
    }
}
