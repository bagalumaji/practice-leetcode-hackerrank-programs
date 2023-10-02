package com.bagal.strings;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValidBalancedString(str));
    }
    static boolean isValidBalancedString(String str){
     Stack<Character> balanced = new Stack<>();
     for(char ch:str.toCharArray()){
         switch (ch){
             case '{':
             case '[':
             case '(':
                 balanced.push(ch);
                 break;
             case '}':
                 if(balanced.isEmpty() || balanced.pop()!='{')
                     return false;
                 break;
             case ']':
                     if(balanced.isEmpty() || balanced.pop()!='['){
                         return false;
                     }
                     break;
             case ')':
                    if(balanced.isEmpty() || balanced.pop() != '('){
                        return false;
                    }
                 break;
         }
     }
     return balanced.isEmpty();
    }
}