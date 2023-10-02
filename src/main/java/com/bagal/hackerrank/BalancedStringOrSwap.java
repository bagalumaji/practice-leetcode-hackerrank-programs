package com.bagal.hackerrank;

public class BalancedStringOrSwap {
    public static void main(String[] args) {
        String str="((())))";
        System.out.println(isBalancedString(str));
    }
    static int isBalancedString(String str){
        if(str.length()%2==1)
            return -1;

        for (int i = 0; i < str.length(); i++) {

        }
        return 1;
    }
}
