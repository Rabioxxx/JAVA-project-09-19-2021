package com.company.devices;

public class Electric extends Car{
    public Electric(String model, String producer, Double value, Integer yearOfProduction, Integer age) {
        super(model, producer, value, yearOfProduction, age);
    }

    @Override
    void refuel() {

    }
}
