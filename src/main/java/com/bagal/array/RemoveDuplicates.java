package com.bagal.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] a = {1,1,2,3,3,4,4,5,5,6};
        int cnt=1;

        for (int i = 1; i < a.length; i++) {
            if(a[i]!=a[i-1]){
                a[cnt] = a[i];
                cnt++;
            }
        }
        for (int i = 0; i < cnt; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
