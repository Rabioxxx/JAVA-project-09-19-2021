package com.company.devices;

public class Diesel extends Car{
    public Diesel(String model, String producer, Double value, Integer yearOfProduction, Integer age) {
        super(model, producer, value, yearOfProduction, age);
    }

    @Override
    void refuel() {

    }
}
