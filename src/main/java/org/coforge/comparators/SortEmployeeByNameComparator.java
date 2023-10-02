package org.coforge.comparators;

import org.coforge.models.Employee;

import java.util.Comparator;

public class SortEmployeeByNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
