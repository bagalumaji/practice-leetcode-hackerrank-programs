package com.bagal.strings;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "aabttcbceddrr";
        System.out.println(firstUniqueCharacter1(str));
    }

    static int firstUniqueCharacter(String str) {
        int index = -1;
        if (str.isBlank())
            return index;
        if(str.length()<2)
            return 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int firstIndex = str.indexOf(ch);
            int lastIndex = str.lastIndexOf(ch);
            if(firstIndex == lastIndex)
                return str.indexOf(ch);
        }
        return index;
    }

    static int firstUniqueCharacter1(String str) {
        int index = -1;
        String t = new String(str);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(i);
            char ch = str.charAt(0);
            int l1 = str.length();
            str = str.replace(ch + "", "");
            int l2 = str.length();
            if (l1 == l2 + 1) {
                index = i;
                break;
            }
        }
        return index;
    }
}
