package com.bagal.demo.sorting;

import java.util.Comparator;

public class SortingStringByAscendingOrder implements Comparator<Sorting> {

    @Override
    public int compare(Sorting o1, Sorting o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
