package com.bagal.strings;

public class RemoveTrailingZerosFromAString {
    public static void main(String[] args) {
        String  num = "51230100";
        System.out.println(removeTrailingZeros(num));
    }
    public static String removeTrailingZeros(String num) {
        int cnt=0;
        for (int i = num.length()-1; i>=0; i--) {
            if(num.charAt(i)!= '0') {
                cnt=i;
                break;
            }
        }
        String result = num.substring(0,++cnt);
        return result;
    }
}
