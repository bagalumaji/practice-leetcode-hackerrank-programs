package org.coforge.coforgetestprograms;

public class BuzzFizz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 3 ==0)
                System.out.println("Fizz");
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
        }
    }
}
