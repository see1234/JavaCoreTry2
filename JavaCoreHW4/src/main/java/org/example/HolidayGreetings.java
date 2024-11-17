package org.example;

import java.time.LocalDate;
import java.time.Month;

public class HolidayGreetings {
    public static void greetEmployees(Employee[] employees) {
        LocalDate today = LocalDate.now();
        Holiday holiday = Holiday.NO_HOLIDAY;

        if (today.getMonth() == Month.JANUARY && today.getDayOfMonth() == 1) {
            holiday = Holiday.NEW_YEAR;
        } else if (today.getMonth() == Month.MARCH && today.getDayOfMonth() == 8) {
            holiday = Holiday.WOMENS_DAY;
        } else if (today.getMonth() == Month.FEBRUARY && today.getDayOfMonth() == 23) {
            holiday = Holiday.MENS_DAY;
        }

        for (Employee emp : employees) {
            switch (holiday) {
                case NEW_YEAR:
                    System.out.println("Happy New Year, " + emp.name + "!");
                    break;
                case WOMENS_DAY:
                    if (emp.gender == Gender.FEMALE) {
                        System.out.println("Happy Women's Day, " + emp.name + "!");
                    }
                    break;
                case MENS_DAY:
                    if (emp.gender == Gender.MALE) {
                        System.out.println("Happy Defender of the Fatherland Day, " + emp.name + "!");
                    }
                    break;
            }
        }
    }
}