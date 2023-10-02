package com.bagal.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DiagonalElementSum {
    public static void main(String[] args) {
        int[][] a = {
                {3,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(getSum(a));
        List<List<Integer>> a1=new ArrayList<>();
        a1.add(List.of(3,2,3));
        a1.add(List.of(4,5,6));
        a1.add(List.of(7,8,9));
        System.out.println(getSum(a1));

    }
    static int getSum(int [][]a){
        int f=0,s=0;
        for (int i = 0; i < a.length; i++) {
            f+=a[i][i];
            s+=a[i][a.length-1-i];
        }
        System.out.println(f);
        System.out.println(s);
        return f-s;
    }
    static int getSum(List<List<Integer>> a ){
        int f=0,s=0;
        for (int i = 0; i < a.size(); i++) {
           f+=a.get(i).get(i);
           s+=a.get(i).get(a.size()-1-i);

        }
        System.out.println(f);
        System.out.println(s);
        return f-s;
    }
}
