package com.company;

import com.company.devices.Car;

import java.util.Date;

public class Human extends Animal{
    String firstName;
    String lastName;
    Integer age;
    private Double salary;
    private Double cash;
    Animal pet;
    private Car car;

    Human(String firstName, String lastName, Double salary) {
        super("homo sapiens");
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Data was send to accounting system.");
            System.out.println("Collect addendum at Mrs. Hania office (HR).");
            System.out.println("IRS was informed about that change too. Nothing will be hidden.");
            this.salary = salary;
        } else {
            System.out.println("Salary = " + salary + ". Salary cannot be negative.");
        }
    }

    Double getSalary() {
        Date dateAndTime = new Date();
        System.out.println(dateAndTime);
        System.out.println("Your salary = " + this.salary);
        return this.salary;
    }

    public void setCar(Car car) {
        if (this.salary >= car.getValue()) {
            System.out.println("You bought a car.");
        } else if (this.salary >= (car.getValue() / 12)) {
            System.out.println("You bought a car on credit.");
        } else {
            System.out.println("You do not have money for this car, go find better job or get a rise.");
        }
    }

    public Car getCar() {
        return this.car;
    }

    public void setCash(Double cash){
        this.cash = cash;
    }

    public Double getCash(){
        return cash;
    }

    public String toString(){
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet + " " + car;
    }
}
