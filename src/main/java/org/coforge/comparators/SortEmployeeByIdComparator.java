package org.coforge.comparators;

import org.coforge.models.Employee;

import java.util.Comparator;

public class SortEmployeeByIdComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getId()  - o2.getId();
    }
}
