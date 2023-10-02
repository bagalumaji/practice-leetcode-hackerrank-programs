package com.bagal;

import com.bagal.comparators.SortEmployeeByNameComparator;
import com.bagal.models.Employee;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class ReadFileAndSortEmployee {
    public static void main(String[] args) throws IOException {
        List<String > lines =  Files.readLines(new File(System.getProperty("user.dir")+"/src/main/resources/data.txt"), StandardCharsets.UTF_8);

        List<Employee> employees = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            String []words = lines.get(i).split(",");
                Employee t = new Employee();
                t.setId(Integer.parseInt(words[0]))
                        .setName(words[1])
                        .setSalary(Float.parseFloat(words[2]));
                employees.add(t);

        }

        employees.sort(new SortEmployeeByNameComparator());

        System.out.println(employees);

    }
}

