package org.coforge.easy;

public class CalculateDigitSumString2243 {
    public static String calculateDigitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder str = new StringBuilder();
            int i = 0;
            while (i < s.length()) {
                int sum = 0;
                int j = 0;
                while (j < k && i < s.length()) {
                    sum += Character.getNumericValue(s.charAt(i));
                    i++;
                    j++;
                }
                str.append(sum);
            }
            s = str.toString();
        }
        return s;
    }

    public static void main(String[] args) {
        String input = "11111222223";
        int k = 3;
        String result = calculateDigitSum(input, k);
        System.out.println("Result after all rounds: " + result);
    }
}
