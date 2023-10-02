package org.coforge.coforgetestprograms;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int [] a= {1,4,2,5,3,6};
        int start=0,end = a.length-1;
        System.out.println("before reversing array elements are : ");
        for (int i : a){
            System.out.print(i+" ");
        }
        System.out.println();
        while(start<end){
            a[start] = a[start]+a[end];
            a[end] = a[start]-a[end];
            a[start] = a[start]-a[end];
            start++;
            end--;
        }
        System.out.println("after reversing");
        for (int i : a){
            System.out.print(i+" ");
        }
    }
}
