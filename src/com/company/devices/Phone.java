package com.company.devices;

public class Phone extends Device {
    Double screenSize;
    String os;

    public Phone(String model, String producer, Integer yearOfProduction, Double screenSize, String os) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }
}
