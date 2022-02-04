package com.company.devices;

public class Application {
    private String name;
    private String version = "v1.0.0";
    private Double price = 0.0;

    public Application(String name){
        this.name = name;
    }

    public Application(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public Application(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
