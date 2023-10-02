package com.bagal.easy;

public class AddDigits258 {
    public static void main(String[] args) {
        int num =0;
        System.out.println(addDigits(num));
    }
    static int addDigits(int num) {

        if(num < 10)
            return num;
        while(num > 9){
            int sum=0;
            while(num!=0){
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        }
        return num;
    }
}
