package org.coforge.hackerrank;

import java.util.List;

public class PlusMinus {
    public static void main(String[] args) {

    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        int positiveCount = 0;
        int n = arr.size();
        int negativeCount = 0;
        int zeroCount = 0;
        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double positiveRatio = (double) positiveCount / n;
        double negativeRatio = (double) negativeCount / n;
        double zeroRatio = (double) zeroCount / n;

        System.out.printf("%.6f%n", positiveRatio);
        System.out.printf("%.6f%n", negativeRatio);
        System.out.printf("%.6f%n", zeroRatio);

    }

}
