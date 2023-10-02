package org.coforge.easy;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(reverseOnlyLetters(s));
        s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
    static String reverseOnlyLetters(String s) {
        if(s.isBlank() || s.length() == 1)
            return s;

        char[] ch = s.toCharArray();
        int i =0, j = s.length()-1;
        while (i<j){
           if(Character.isLetter(s.charAt(i)) && Character.isLetter(s.charAt(j))){
                char c = ch[i];
                ch[i] = ch[j];
                ch[j] = c;
                i++;
                j--;
           }else  if(!Character.isLetter(s.charAt(i))){
               i++;
           }else {
               j--;
           }
        }
        return new String(ch);
    }
}
