package com.bagal.hackerrank;

import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(73, 67, 38, 33);
        System.out.println(gradingStudents(list));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) >= 38) {
                int nextMultipleOf5 = ((grades.get(i) + 4) / 5) * 5;
                if (nextMultipleOf5 - grades.get(i) < 3) {
                    grades.set(i, nextMultipleOf5);
                }
            }
        }
        return grades;
    }
}
