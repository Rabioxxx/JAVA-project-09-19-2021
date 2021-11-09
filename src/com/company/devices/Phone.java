package com.company.devices;

import com.company.creatures.Human;

public class Phone extends Device {
    Double screenSize;
    String os;
    static final String defaultServerURL = "https://www.downloadalltheappshere.com";
    static final String defaultProtocol = "Protocol0000";
    static final String defaultVersionName = "v1.0";

    public Phone(String model, String producer, Double value, Integer yearOfProduction, Double screenSize, String os) {
        super(model, producer, value, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }

    public void installAnApp(String appName) {
        System.out.println("Application " + appName + " has been installed.");
    }

    public void installAnApp(String appName, String version) {
    }

    public void installAnApp(String appName, String version, String server) {
    }

    public void installAnApp(String[] appList) {
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
