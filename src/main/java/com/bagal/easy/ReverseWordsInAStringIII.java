package com.bagal.easy;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
        s = "God Ding";
        System.out.println(reverseWords(s));
    }

    static String reverseWords(String s) {
        if(s.isBlank())
            return s;
        String [] words = s.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (String word : words) {
            stringBuffer.append(new StringBuffer(word).reverse()+" ");
        }
        return stringBuffer.toString().trim();
    }
}
