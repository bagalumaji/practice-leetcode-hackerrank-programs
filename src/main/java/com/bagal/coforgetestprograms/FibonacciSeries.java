package com.bagal.coforgetestprograms;

public class FibonacciSeries {
    public static void main(String[] args) {
        printFibonacciSeries(3);
    }
    static void printFibonacciSeries(int target){
        int first=0,second=1;
        int result = first+second;
        System.out.print(first+" "+second+" "+result+" ");
        while (result<target){
            first = second;
            second = result;
            result = first+second;
            System.out.print( result+" ");
        }
        System.out.println();
    }
}
