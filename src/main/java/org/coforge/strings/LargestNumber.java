package org.coforge.strings;

public class LargestNumber {
    public static void main(String[] args) {
        int[] n={3,30,34,5,9};
        System.out.println(largestNumber(n));
    }

    static String largestNumber(int[] nums) {
        String [] t = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            t[i]=String.valueOf(nums[i]);
        }
        String result="";
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if((t[i]+t[j]).compareTo((t[j]+t[i]))<0){
                    String s=t[i];
                    t[i]=t[j];
                    t[j]=s;
                }
            }
            result+=t[i];
        }
        return result;
    }
}
