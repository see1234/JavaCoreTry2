package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("1", 2023, 10, 26, 50000),
                new Employee("2", 2022, 5, 15, 60000),
                new Manager("3", 2024, 2, 1, 70000)
        };


        System.out.println(Arrays.toString(employees));
        Employee.raiseSalary(employees, 10);
        System.out.println(Arrays.toString(employees));

        Comparator<Employee> dateComparator = (e1, e2) -> e1.compareDates(e2);
        Arrays.sort(employees, dateComparator);
        System.out.println(Arrays.toString(employees));

    }
}
