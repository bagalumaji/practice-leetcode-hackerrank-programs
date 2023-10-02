package org.coforge.easy;

import java.util.ArrayList;
import java.util.List;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s.toLowerCase()));
    }

    static boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        char [] ch = s.trim().toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if(ch[i]>='a' && ch[i]<='z' || Character.isDigit(ch[i]))
                list.add(ch[i]);
        }
        List<Character> list1 = new ArrayList<>(list);
        StringBuffer s1= new StringBuffer();
        StringBuffer s2 = new StringBuffer();
        int j = list1.size()-1;
        for (int i = 0; i < list1.size(); i++) {
            s1.append(list1.get(i));
            s2.append(list.get(j));
            j--;
        }
        System.out.println(s1);
        System.out.println("s2 = " + s2);
        return s1.toString().equals(new String(s2));
    }
}
