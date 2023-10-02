package com.bagal.hackerrank;

public class PrimeOrIfNotReturnSmallestDivisorGt1 {
    public static void main(String[] args) {
        System.out.println(isPrimeOrNot(15));
    }
    static int isPrimeOrNot(int num){
        boolean flag=true;
        boolean f=true;
        int n=0;
        for(int i=2;i<num;i++){
            if(num % i ==0 ){
                if(f){
                    n = i;
                    f=false;
                }
                flag=false;
                break;
            }
        }
        return flag ? 1 : n;
    }
}
