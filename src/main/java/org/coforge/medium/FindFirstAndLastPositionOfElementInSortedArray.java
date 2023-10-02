package org.coforge.medium;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int[] n = {5, 7, 7, 8, 8, 10};
        int t = 86;
        int[] result = searchRange(n, t);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int first=-1;
        int last=-1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                first=i;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                last=i;
                break;
            }
        }
        int[] temp=new int[2];
        temp[0]=first;
        temp[1]=last;
        return temp;
    }
}