package org.coforge.coforgetestprograms.employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee [] employees = new Employee[5];
        employees[0] = new Employee("abc",2,6000);
        employees[1] = new Employee("pqr",1,8000);
        employees[2] = new Employee("xyz",4,8000);
        employees[3] = new Employee("efg",5,4000);
        employees[4] = new Employee("ufg",3,7000);

        TreeSet<Employee> treeSet = new TreeSet<>(new SortEmployeeById());

        treeSet.add(employees[0]);
        treeSet.add(employees[1]);
        treeSet.add(employees[2]);
        treeSet.add(employees[3]);
        treeSet.add(employees[4]);

        Arrays.sort(employees,new SortEmployeeById());
        System.out.println(Arrays.asList(employees));

        //System.out.println(treeSet);


    }
}
