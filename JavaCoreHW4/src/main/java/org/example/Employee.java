package org.example;

public class Employee {
    String name;
    Gender gender;
    int year, month, day;
    double salary;

    public Employee(String name, Gender gender, int year, int month, int day, double salary) {
        this.name = name;
        this.gender = gender;
        this.year = year;
        this.month = month;
        this.day = day;
        this.salary = salary;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }


    public static void raiseSalary(Employee[] employees, double percent) {
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                emp.salary *= (1 + percent / 100);
            }
        }
    }

    @Override
    public String toString() {
        return name + ": " + salary + ", Gender: " + gender;
    }
}