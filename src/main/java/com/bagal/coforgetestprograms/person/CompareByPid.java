package com.bagal.coforgetestprograms.person;

import java.util.Comparator;

public class CompareByPid implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getPid() - o2.getPid();
    }
}
