package com.bagal.coforgetestprograms;

public class ReverseString {
    public static void main(String[] args) {
        String str ="Good Morning World";
        String result ="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        System.out.println("result = " + result);
        /*
         or by using string buffer class
         System.out.println(new StringBuffer(str).reverse());
         */
    }
}
