package com.company.devices;

public class LPG extends Car{
    public LPG(String model, String producer, Double value, Integer yearOfProduction, Integer age) {
        super(model, producer, value, yearOfProduction, age);
    }

    @Override
    void refuel() {

    }
}
