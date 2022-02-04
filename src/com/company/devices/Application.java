package com.company.devices;

public class Application {
    String name;
    String version = "v1.0.0";
    Double price = 0.0;

    public Application(String name){
        this.name = name;
    }

    public Application(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }
}
