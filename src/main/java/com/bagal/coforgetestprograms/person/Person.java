package com.bagal.coforgetestprograms.person;

public class Person {
    private int pid;
    private String name;

    public String getCity() {
        return city;
    }

    private String city;

    public Person(int pid, String name, String city) {
        this.pid = pid;
        this.name = name;
        this.city = city;
    }

    public int getPid() {
        return pid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
