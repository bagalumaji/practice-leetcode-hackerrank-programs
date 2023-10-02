package org.coforge.demo.sorting;

public class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
    public int getSalary() {
        return this.salary;
    }
}
