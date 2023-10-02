package org.coforge.hackerrank;

import java.util.List;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
    List<Integer> arr = List.of(18,90, 90, 13, 90, 75, 90, 8, 90, 43);
        System.out.println(birthdayCakeCandles(arr));
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int cnt=0;
        int max1=candles.get(0),max2 = candles.get(0);

        for (int i = 0; i < candles.size(); i++) {
            if(max1< candles.get(i)){
                max1 = candles.get(i);
                cnt = 1;
            }else if(max1 == candles.get(i)){
                cnt++;
            }
        }
        return cnt;
    }
}
