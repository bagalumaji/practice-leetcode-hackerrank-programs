package org.coforge.coforgetestprograms;

public class ReverseNumber {
    public static void main(String[] args) {
        int iPositive = 15;
        int iNegative = ( ~(iPositive - 1) ) ; // Use extra brackets when using as C preprocessor directive ! ! !...
        System.out.println(iNegative);
        System.out.println(reversNumber(-123));
    }

    static int reversNumber(int x) {
        int x1 = x;
        int result = 0;

        while (x != 0) {
            int d = x % 10;
            x = x / 10;
            result = result * 10 + d;
        }
        if (x1 < 0) {
            System.out.println("x1 : "+x1);
            result = -(-(result));
            System.out.println("r = " + result);

        }

        return result;

    }
}
