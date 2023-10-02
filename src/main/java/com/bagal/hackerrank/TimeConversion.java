package com.bagal.hackerrank;

public class TimeConversion {
    public static void main(String[] args) {
        String str = "12:45:54PM";
        System.out.println(timeConversion(str));
    }

    public static String timeConversion(String s) {
        String am = s.substring(s.length() - 2);
        int val = Integer.parseInt(s.substring(0, 2));
        String result = "";
        String substring = s.substring(2, s.length() - 2);
        String substring1 = s.substring(0, s.length() - 2);
        if (am.toLowerCase().contains("am")) {
            if (val == 12)
                return "00"+substring;
            else
                return substring1;
        } else {
            if (val == 12) {
                result = substring1;;
            } else {
                result = val + 12 + substring;
            }
        }
        return result;
    }
}
