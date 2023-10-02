package org.coforge.hackerrank;

public class SeparateNumbers {
    public static void main(String[] args) {

        String numericString = "12345"; // Replace with your numeric string
        separateNumbers(numericString);

    }


    public static long check(String s) {
        for (int j = 1; j < s.length()+1 && j < 18; j++) {
            long a = Long.parseLong(s.substring(0, j));
            long init = a;
            String temp = "" + a;
            int count = 1;
            while (temp.length() < s.length()) {
                a++;
                count++;
                temp += a;
            }
            if (temp.equals(s) && count >= 2) {
                return init;
            }
        }
        return -1;

    }
    public static void separateNumbers(String s) {
        long res = check(s);
        if(res!=-1)
            System.out.println("YES "+res);
        else
            System.out.println("NO");

    }
}


