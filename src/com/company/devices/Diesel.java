package com.company.devices;

import com.company.creatures.Human;

public class Diesel extends Car{
    public Diesel(String model, String producer, Double value, Integer yearOfProduction, Integer age, Human firstOwner) {
        super(model, producer, value, yearOfProduction, age, firstOwner);
    }

    @Override
    void refuel() {

    }
}
