package org.example;

public class Employee {
    String name;
    int year, month, day;
    double salary;

    public Employee(String name, int year, int month, int day, double salary) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.salary = salary;
    }

    public static void raiseSalary(Employee[] employees, double percent) {
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                emp.salary *= (1 + percent / 100);
            }
        }
    }
    public int compareDates(Employee other) {
        int yearDiff = Integer.compareUnsigned(this.year, other.year);
        int monthDiff = (yearDiff == 0) ? Integer.compareUnsigned(this.month, other.month) : yearDiff;
        int dayDiff = (monthDiff == 0) ? Integer.compareUnsigned(this.day, other.day) : monthDiff;
        return ((dayDiff >>> 31) ^ 1) * dayDiff;
    }

    @Override
    public String toString() {
        return name + ": " + salary;
    }
}