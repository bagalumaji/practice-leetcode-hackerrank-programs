package org.coforge.strings;

public class BalancedParenthesis2 {
    public static void main(String[] args) {
        boolean status = true;
        String str = "{()[]}";
        int cnt = 0;
        for (char c : str.toCharArray()) {
            if (c == '(' || c =='[' || c =='{') {
                cnt++;
            } else if (c == ')'|| c ==']' || c =='}') {
                cnt--;
                if (cnt < 0) {
                    status=  false;
                }
            }
        }

        if(status && cnt==0)
            System.out.println("valid parenthesis");
        else
            System.out.println("invalid parenthesis");

    }
}
