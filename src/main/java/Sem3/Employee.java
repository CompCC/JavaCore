package Sem3;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Employee implements Comparable<Employee> {
    private String fio;
    private String post;
    private String phone;
    private BigDecimal salary;
    private LocalDate brithDate;

    public Employee(String fio, String post, String phone, BigDecimal salary, LocalDate brithDate) {
        this.fio = fio;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
        this.brithDate = brithDate;
    }

    public String getFio() {
        return fio;
    }

    public Employee setFio(String fio) {
        this.fio = fio;
        return this;
    }

    public String getPost() {
        return post;
    }

    public Employee setPost(String post) {
        this.post = post;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Employee setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public Employee setSalary(BigDecimal salary) {
        this.salary = salary;
        return this;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    public Employee setBrithDate(LocalDate brithDate) {
        this.brithDate = brithDate;
        return this;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(brithDate, currentDate).getYears();
    }

    @Override
    public String toString() {
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(brithDate, currentDate).getYears();
        return String.format("%s - %s, phone - %s, salary - %s, age - %s", fio, post, phone, salary, age);

    }

    public void printInfo() {
        System.out.println(this);
    }

    public void increaseSalary(int value) {
        this.salary = salary.add(BigDecimal.valueOf(value));
    }
//Написать прототип компаратора - метод внутри класса сотрудника,
// сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
    @Override
    public int compareTo(Employee o) {
        return this.getBrithDate().compareTo(o.getBrithDate());
    }
}
