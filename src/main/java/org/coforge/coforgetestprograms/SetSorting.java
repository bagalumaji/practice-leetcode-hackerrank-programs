package org.coforge.coforgetestprograms;

import java.util.*;

public class SetSorting {
    public static void main(String[] args) {
        Set<Integer> hashSet = new LinkedHashSet<>();
        hashSet.add(51);
        hashSet.add(2);
        hashSet.add(18);
        hashSet.add(1);
        hashSet.add(10);

        List<Integer> lst = new ArrayList<>(hashSet);

        Collections.sort(lst);

        System.out.println(lst);
        System.out.println(new LinkedHashSet<>(lst));

    }
}
