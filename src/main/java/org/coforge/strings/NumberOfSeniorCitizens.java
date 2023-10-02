package org.coforge.strings;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String s[]={"7868190130M7522","5303914400F9211","9273338290F4010"};

        System.out.println(countSeniors(s));
    }
    public static int countSeniors(String[] details) {
        int cnt=0;

        for (String word : details){
            char ch1 = word.charAt(word.length()-4);
            char ch2 = word.charAt(word.length()-3);
            int res =Integer.parseInt(ch1 +String.valueOf(ch2));
           if(res>60)
               cnt++;
        }

        return cnt;
    }
}
