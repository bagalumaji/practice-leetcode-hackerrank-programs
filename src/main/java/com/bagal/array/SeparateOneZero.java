package com.bagal.array;

public class SeparateOneZero {
    public static void main(String[] args) {
        int [] a = {1,0,1,1,0,0,0};
        int cnt=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 1 ){
                a[cnt++] = 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(i<cnt){
                System.out.print(a[i]+" ");
            }else{
                a[i] = 0;
                System.out.print(a[i]+" ");
            }
        }
    }
}
