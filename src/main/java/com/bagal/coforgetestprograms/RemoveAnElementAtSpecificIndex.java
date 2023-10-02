package com.bagal.coforgetestprograms;

public class RemoveAnElementAtSpecificIndex {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int index = 2;
        int[] result = removeTheElement(a, index);
        for (int i : result) {
            System.out.print(i + " ");
        }

    }

    static int[] removeTheElement(int[] a, int index) {
        if (a.length == 0 || index < 0 || index > a.length)
            return a;
        int cnt = 0;
        int[] result = new int[a.length - 1];
        for (int i = 0; i < a.length; i++) {
            if (i != index) {
                result[cnt++] = a[i];
            }
        }
        return result;
    }


}
