package com.bagal.easy;

public class PlusOne {
    public static void main(String[] args) {
        int[] s = {9, 9};
        int[] plusOne = plusOne(s);
        for (int j : plusOne) {
            System.out.print(j + " ");
        }
    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i>=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else {
                digits[i] = 0;
            }
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }
}
