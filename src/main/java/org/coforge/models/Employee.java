package org.coforge.models;

public class Employee {

    private int id;
    private String name;
    private float salary;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public Employee setSalary(float salary) {
        this.salary = salary;
        return this;
    }

    public String getName() {
        return name;
    }



    public float getSalary() {
        return salary;
    }


}
