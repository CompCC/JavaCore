//Опишите класс руководителя, наследник от сотрудника. Перенесите статический метод повышения
// зарплаты в класс руководителя, модифицируйте метод таким образом,
// чтобы он мог поднять заработную плату всем, кроме руководителей.
// В основной программе создайте руководителя и поместите его в общий массив сотрудников.
// Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

package Sem3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Director extends Employee {
    public Director(String fio, String post, String phone, BigDecimal salary, LocalDate brithDate) {
        super(fio, post, phone, salary, brithDate);
    }

    public static void increaseSalaryFor_Years(List<Employee> employees, int ageOlder, int bonusValue) {
        for (Employee employee : employees) {
            if (employee.getAge() > ageOlder && !(employee.getPost().toLowerCase().equals("director"))) {
                employee.increaseSalary(bonusValue);
            }
        }
    }
}
