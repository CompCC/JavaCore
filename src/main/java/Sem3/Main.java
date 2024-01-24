package Sem3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович",
                "инженер", "123456789", BigDecimal.valueOf(100000),
                LocalDate.of(1990, 1, 1));

        Employee employee2 = new Employee("Петров Иван Иванович",
                "программист", "123456789", BigDecimal.valueOf(203000),
                LocalDate.of(1984, 1, 1));

        Employee employee3 = new Employee("Сидоров Иван Иванович",
                "аналитик", "123456789", BigDecimal.valueOf(100000),
                LocalDate.of(1990, 1, 1));

        Employee employee4 = new Employee("Никифоров Иван Иванович",
                "teamlead", "123456789", BigDecimal.valueOf(550000),
                LocalDate.of(1975, 1, 1));

        Employee employee5 = new Employee("Васильев Иван Иванович",
                "инженер", "123456789", BigDecimal.valueOf(80000),
                LocalDate.of(1990, 1, 1));

        Director director = new Director("Васечкин Кирилл Николаевич", "Director", "1235431122",
                BigDecimal.valueOf(800000), LocalDate.of(1974, 5, 18));

//        System.out.println(employee1);
//        employee1.printInfo();

        List<Employee> employees = new ArrayList<>(Arrays.asList(employee1, employee2, employee3, employee4, employee5, director));
        for (Employee employee : employees) {
            employee.printInfo();
        }
        System.out.println("");

        Director.increaseSalaryFor_Years(employees, 45, 30000);

        for (Employee employee : employees) {
            employee.printInfo();
        }

        System.out.println(getAverageSalaryAndAge(employees));

        System.out.println("");

        Collections.sort(employees);

        for (Employee employee : employees) {
            employee.printInfo();
        }
    }

//    public static void increaseSalaryFor_Years(List<Employee> employees, int ageOlder, int bonusValue) {
//        for (Employee employee : employees) {
//            if (employee.getAge() > ageOlder) {
//                employee.increaseSalary(bonusValue);
//            }
//        }
//    }

    public static String getAverageSalaryAndAge(List<Employee> employees) {
        double averageSalaries = employees.stream().mapToDouble(x -> x.getSalary().doubleValue()).average().orElseThrow();
        double averageAge = employees.stream().mapToDouble(x -> (double) x.getAge()).average().orElseThrow();
        return String.format("Aver. Age: %s, Aver. Sal: %s", averageAge, averageSalaries);
    }
}
