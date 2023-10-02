package com.bagal;

import java.util.Arrays;

public class ListDemo  {
    public static void main(String[] args) {
       Integer a [] = {1,2,3,5,4};

//        for (int i = 0; i < a.length; i++) {
//            for (int j = i; j < a.length; j++) {
//                if(a[i]<a[j]){
//                    int t = a[i];
//                    a[i] = a[j];
//                    a[j] = t;
//                }
//            }
//        }

        Arrays.sort(a,(x, b) -> b.compareTo(x));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


}

class A {

}

class B extends A {
}