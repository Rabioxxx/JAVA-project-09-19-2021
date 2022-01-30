package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Human extends Animal {
    private final String firstName;
    private final String lastName;
    private Double salary;
    private Double cash;
    public Pet pet;
    private Car[] garage;
    private Double liabilities;

    public Human(String firstName, String lastName, Double weight, Integer age, Double salary, Double cash, Double liabilities, int garageSize) {

        // TODO:Add weight and age as variables. Could randomise it.
        // Right now these values are constant and same for every created Human.
        super("Homo Sapiens", weight, age);
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.cash = cash;
        this.liabilities = liabilities;
        this.garage = new Car[garageSize];
    }

    public void feed() {
    }

    public void feed(Double foodWeight) {
    }

    public void setPet() {
        this.pet = null;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setSalary(Double salary) {
        if (salary > 0) {
            System.out.println("Data was send to accounting system.");
            System.out.println("Collect addendum at Mrs. Hania office (HR).");
            System.out.println("IRS was informed about that change too. Nothing will be hidden.");
            this.salary = salary;
        } else {
            System.out.println("Salary = " + salary + ". Salary cannot be negative.");
        }
    }

    public Double getSalary() {
        Date dateAndTime = new Date();
        System.out.println(dateAndTime);
        System.out.println("Your salary = " + salary);
        return salary;
    }

    public void setGarage() {
        this.garage = null;
    }

    public void setGarage(Car car) {
        Double carValue = car.getValue();
        Double mortgagePayment = carValue / 12.0;
        if (this.cash >= carValue) {
            this.cash -= carValue;
            this.addCarToGarage(car);
            System.out.println("You bought a " + car.getName() + " for cash.");
        } else if (salary >= mortgagePayment) {
            liabilities = carValue - mortgagePayment;
            cash -= mortgagePayment;
            this.addCarToGarage(car);
            System.out.println("You bought a " + car.getName() + " on credit and paid first mortgage.");
        } else {
            System.out.println("You do not have money for this car, go find better job or get a rise to qualify for credit.");
        }
    }

    private void addCarToGarage(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                break;
            }
        }
        System.out.println("Didn't add car to garage, as there is no free space for it!");
    }

    public Car getCarFromGarage(int parkingSpotNumber) {
        if (parkingSpotNumber <= this.garage.length) {
            return garage[parkingSpotNumber];
        }
        return null;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }

    public Double getCash() {
        return cash;
    }

    public String toString() {
        return firstName + " " + lastName + " " + age + " " + salary + " " + pet + " " + Arrays.toString(garage);
    }

    public boolean checkForCarInGarage(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                return true;
            }
        }
        return false;
    }
}
