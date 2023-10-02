package org.coforge.hackerrank;

public class StrongPassword {
    public static void main(String[] args) {
        String str = "frtg";
        int n = 6;
        System.out.println(minimumNumber(n, str));
    }

    static int minimumNumber(int n, String password) {
        boolean hasDigit = false;
        boolean hasLowercase = false;
        boolean hasUppercase = false;
        boolean hasSpecialChar = false;

        String specialChars = "!@#$%^&*()-+";

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (specialChars.contains(String.valueOf(c))) {
                hasSpecialChar = true;
            }
        }

        int additionsNeeded = 0;

        if (!hasDigit) {
            additionsNeeded++;
        }
        if (!hasLowercase) {
            additionsNeeded++;
        }
        if (!hasUppercase) {
            additionsNeeded++;
        }
        if (!hasSpecialChar) {
            additionsNeeded++;
        }

        return Math.max(6 - n, additionsNeeded);
    }
}
