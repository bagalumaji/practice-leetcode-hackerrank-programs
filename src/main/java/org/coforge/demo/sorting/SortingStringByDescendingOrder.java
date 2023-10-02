package org.coforge.demo.sorting;

import java.util.Comparator;

public class SortingStringByDescendingOrder implements Comparator<Sorting> {

    @Override
    public int compare(Sorting o1, Sorting o2) {
        return o2.getName().compareTo(o1.getName());
    }
}
