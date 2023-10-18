package com.bagal.strings;

public class Testlongest {
    public static void main(String[] args) {
         String str ="tcbbct";
        int cnt = 0;
        String res = "";
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        String t = str.substring(i, j + 1);
                        if (t.equals(getReversedString(t)) && cnt < t.length()) {
                            res = t;
                            cnt = t.length();
                        }
                    }
                }
            }

        System.out.println("res = " + res);
    }
   static String getReversedString(String s){
        return new StringBuilder(s).reverse().toString();
    }
}
