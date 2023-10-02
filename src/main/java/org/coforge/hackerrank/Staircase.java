package org.coforge.hackerrank;

public class Staircase {
    public static void main(String[] args) {
        int size = 4;
        printStairCase(size);

    }
    static void printStairCase(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=1; j++) {
                int sp = n-i;
                for (int i1 = 0; i1 < sp; i1++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <=i ; k++) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
