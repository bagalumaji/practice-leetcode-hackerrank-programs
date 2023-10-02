package org.coforge.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(3);

        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        long totalSum = 0;

        for (int i = 0; i < 5; i++) {
            totalSum += arr.get(i);
            minSum = Math.min(minSum, arr.get(i));
            maxSum = Math.max(maxSum, arr.get(i));
        }

        long minPossibleSum = totalSum - maxSum;
        long maxPossibleSum = totalSum - minSum;

        System.out.println(minPossibleSum + " " + maxPossibleSum);
    }
}
