package com.bagal.coforgetestprograms;

public class SumOf3ElementFromArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6,7,8};
        int target = 6;
        //int[] sum = getSumFromArray(a, target);
        int[] sum = getSumFromArray1(a, target);
        for (int i : sum) {
            System.out.println(i);
        }
    }
    static int [] getSumFromArray(int []a, int target){
        int  [] result = new int[3];
        int sum=0;
        int i,j,start=0;

        for ( i = 0; i < a.length; i++) {
            for ( j=i;j<i+3;j++){
                sum+=a[i];
            }
            if(target == sum){
                start=i;
                break;
            }
        }
        for (int k = 0; k <3 ; k++) {
            result[k] = start++;
        }
        return result;
    }

    // 2 way
    static int[] getSumFromArray1(int[] a, int target) {
        int[] result = new int[3];

        if (a.length < 3) {
            return result; // Not enough elements to find a sum of 3
        }

        int sum = a[0] + a[1] + a[2];
        int start = 0;

        for (int i = 3; i < a.length; i++) {
            sum = sum - a[i - 3] + a[i];
            if (sum == target) {
                start = i - 2;
                break;
            }
        }

        for (int k = 0; k < 3; k++) {
            result[k] = start++;
        }

        return result;
    }
}

