package com.bagal.hackerrank;

import java.util.List;

public class AVeryBigSum {
    public static void main(String[] args) {

    }
    public static long aVeryBigSum(List<Long> ar) {
       return   ar.stream().reduce(0L,Long::sum);
    }
}
