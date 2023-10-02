package org.coforge.strings;

import java.util.List;

public class WordBreak {
    public static void main(String[] args) {

    }

    public boolean wordBreak(String s, List<String> wordDict) {
        int cnt=0;
        for (int i = 0; i < wordDict.size(); i++) {
            if(s.contains(wordDict.get(i))) {
                String t = wordDict.get(i);
                String[] words = s.split(t);
                cnt++;
            }

        }
        return wordDict.size() == cnt;
    }
}
