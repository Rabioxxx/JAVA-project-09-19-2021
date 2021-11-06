package com.company.devices;

public class Car extends Device {
    Integer age;

    public Car(String model, String producer, Integer value, Integer yearOfProduction, Integer age) {
        super(model, producer, value, yearOfProduction);
        this.age = age;
    }

    public void turnOn(){
        System.out.println("Przekręcam kluczyk.");
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getValue() {
        return value;
    }

    /*public void setModel(String model) {
        this.model = model;
    }*/

    /*public void setProducer(String producer) {
        this.producer = producer;
    }*/

    /*public void setYearOfProduction(Integer yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
        this.age = 2021 - yearOfProduction;
    }*/

    public void setValue(Integer value) {
        this.value = value;
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction + " " + age + " " + value;
    }
}
