package com.company.devices;

import com.company.Sellable;

public abstract class Device implements Sellable {
    final String model;
    final String producer;
    final Integer yearOfProduction;
    Double value;

    public Device(String model, String producer, Double value, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.value = value;
    }

    public abstract void turnOn();

    public String toString() {
        return model + " " + producer + " " + yearOfProduction + " " + value;
    }
}
