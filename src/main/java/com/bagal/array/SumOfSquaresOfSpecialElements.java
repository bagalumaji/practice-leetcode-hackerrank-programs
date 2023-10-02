package com.bagal.array;

public class SumOfSquaresOfSpecialElements {
    public static void main(String[] args) {
        int [] a = {2,7,1,19,18,3};
        System.out.println(sumOfSquares(a));
    }
    public static  int sumOfSquares(int[] nums) {
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums.length % (i+1) == 0){
                result += nums[i] * nums[i];
            }
        }
        return result;
    }
    /*

    There are exactly 3 special elements in nums:
    nums[1] since 1 divides 4, nums[2] since 2 divides 4, and nums[4] since 4 divides 4.
    Hence, the sum of the squares of all special elements of nums is
    nums[1] * nums[1] + nums[2] * nums[2] + nums[4] * nums[4]
    = 1 * 1 + 2 * 2 + 4 * 4 = 21.


     */
}
