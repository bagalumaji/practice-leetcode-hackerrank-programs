package org.coforge.coforgetestprograms;

public class MultipleThreeNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int[] result = multiplyArray(num);
        for (int i : result) {
            System.out.println(i);
        }

    }

    static int[] multiplyArray(int[] num) {
        int sum = 1;
        int[] result = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (i != j) {
                    sum *= num[j];
                }
            }
            result[i] = sum;
            sum = 1;
        }
        return result;
    }

    // 2 way
    static int[] multiplyArray1(int[] num) {
        int n = num.length;
        int[] result = new int[n];

        int totalProduct = 1;
        for (int value : num) {
            totalProduct *= value;
        }

        for (int i = 0; i < n; i++) {
            result[i] = totalProduct / num[i];
        }

        return result;
    }
}