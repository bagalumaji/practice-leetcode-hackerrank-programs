package org.coforge.hackerrank;

public class CaesarCipher {
    public static void main(String[] args) {
        String str = "AbC-ff-Y-y-Z-z";
        int k = 2;
        System.out.println(caesarCipher(str, k));
    }

    public static String caesarCipher(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                char encryptedChar = (char) ((ch - base + k) % 26 + base);
                stringBuilder.append(encryptedChar);
            } else {
                stringBuilder.append(ch);
            }
        }

        return stringBuilder.toString();
    }
}