package org.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("1", Gender.FEMALE, 2023, 10, 26, 50000),
                new Employee("2", Gender.MALE, 2022, 5, 15, 60000),
                new Manager("3", Gender.MALE, 2024, 2, 1, 70000)
        };

        HolidayGreetings.greetEmployees(employees);
    }
}
