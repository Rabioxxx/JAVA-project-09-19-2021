package com.company.devices;

public class Applications {
    String name;
    String version = "v1.0.0";
    Double price = 0.0;

    Applications(String name){
        this.name = name;
    }

    public Applications(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public Applications(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }
}
