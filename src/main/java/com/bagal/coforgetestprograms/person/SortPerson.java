package com.bagal.coforgetestprograms.person;

import java.util.Arrays;

public class SortPerson {
    public static void main(String[] args) {
        Person [] person = new Person[5];
        person[0] = new Person(2,"A","pune");
        person[1] = new Person(1,"B","mumbai");
        person[2] = new Person(5,"D","noida");
        person[3] = new Person(3,"C","goa");
        person[4] = new Person(4,"E","delhi");

        Arrays.sort(person,new CompareByPid());

        for (Person p : person) {
            System.out.println(p);
        }


    }
}
