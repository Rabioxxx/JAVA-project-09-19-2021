package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
    Double screenSize;
    String os;
    Applications[] apps;

    public Phone(String model, String producer, Double value, Integer yearOfProduction, Double screenSize, String os) {
        super(model, producer, value, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }

    public void sell(Human seller, Human buyer, Double price) {
    }

    public void turnOn() {
        System.out.println("Włączam telefon.");
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction + " " + value + " " + screenSize + " " + os;
    }
}
