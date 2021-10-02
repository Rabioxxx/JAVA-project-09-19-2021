package com.company;

import java.util.Date;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    Animal pet;
    private Car car;

    Human() {
        this.salary = 1300.0;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Dane zostały wysłane do systemu księgowego.");
            System.out.println("Odbierz aneks do umowy od pani Hani skądś tam.");
            System.out.println("ZUS i US został również poinformowany o zmainie wypłaty.");
            this.salary = salary;
        } else {
            System.out.println("Wypłata = " + this.salary + ". Wypłata nie może być ujemna.");
        }
    }

    Double getSalary() {
        Date dateAndTime = new Date();
        System.out.println(dateAndTime);
        System.out.println("Wynagrodzenie = " + this.salary);
        return this.salary;
    }

    Object getCar() {
        return this.car;
    }

    void setCar() {
        if (this.salary >= this.car.value) {
            System.out.println("You bought a car.");
        } else if (this.salary >=(this.car.value / 12)) {
            System.out.println("You bought a car on credit.");
        } else {
            System.out.println("You do not have money for this car, go find better job or get a rise.");
        }
    }
}
