package org.coforge.easy;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    static int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;

        for (int j = 0; j < stones.length(); j++) {
            cnt += jewels.indexOf(stones.charAt(j)) > -1 ? 1 : 0;
        }
        return cnt;
    }
}
