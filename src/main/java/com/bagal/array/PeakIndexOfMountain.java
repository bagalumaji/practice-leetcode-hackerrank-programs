package com.bagal.array;

public class PeakIndexOfMountain {
    public static void main(String[] args) {
        int [] arr = {0,10,5,2};
        System.out.println("peakIndexInMountainArray(arr) = " + peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int b=0;
        int e=arr.length-1;
        while(b<=e){
            int mid = (b+e)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1])
                return mid;
            else if(arr[mid] < arr[mid+1]){
                b = mid+1;
            }else {
                e = mid-1;
            }
        }
        return b;
    }
}
