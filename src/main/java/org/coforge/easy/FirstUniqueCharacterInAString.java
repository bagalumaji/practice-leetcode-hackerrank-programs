package org.coforge.easy;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
    String s = "leetcode";
        System.out.println(firstUniqChar2(s));
    }

    static int firstUniqChar1(String s) {
        if (s == null || s.isEmpty())
            return -1;
        String t = s;
        int index=-1;
        while(s.length()>0){
            int l1 = s.length();
            char ch = s.charAt(0);
            s = s.replace(ch+"","");
            int l2 =  s.length();
            if(l1 ==l2+1){
                index = t.indexOf(ch);
                break;
            }

        }
        return index;
    }
    static int firstUniqChar2(String s) {
        int ans = Integer.MAX_VALUE;
        for(char c='a'; c<='z';c++){
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
