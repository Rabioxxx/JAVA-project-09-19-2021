package com.company;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    Car car;

    Human() {
        this.salary = 1300.0;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    Double getSalary(){
        System.out.println("Wynagrodzenie " + this.salary);
        return this.salary;
    }
}
