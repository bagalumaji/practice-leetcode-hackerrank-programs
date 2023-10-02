package org.coforge.coforgetestprograms;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int []a  = {0,0,1,1,1,2,2,3,3,4};
        int c = removeDuplicates(a);
        System.out.println(c);
        for (int i = 0; i <c ; i++) {
            System.out.println(a[i]);
        }
    }
    static int removeDuplicates(int []a){
        int cnt=0;
        for (int i = 1; i <a.length ; i++) {
            if(a[cnt]!=a[i]){
                a[++cnt] = a[i];
            }
        }
        return cnt+1;
    }
}
