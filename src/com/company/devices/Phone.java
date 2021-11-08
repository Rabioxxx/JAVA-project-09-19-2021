package com.company.devices;

public class Phone extends Device {
    Double screenSize;
    String os;

    public Phone(String model, String producer, Integer value, Integer yearOfProduction, Double screenSize, String os) {
        super(model, producer, value, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }

    public void turnOn(){
        System.out.println("Włączam telefon.");
    }

    public String toString(){
        return model + " " + producer + " " + yearOfProduction + " " + value + " " + screenSize + " " + os;
    }
}
