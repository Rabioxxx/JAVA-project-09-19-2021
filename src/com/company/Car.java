package com.company;

public class Car {
    String model;
    String producer;
    Integer yearOfProduction = 0;
    Integer age = 2021 - yearOfProduction;
    Integer value;

    public String toString(){
        return model + " " + producer + " " + yearOfProduction + " " + age + " " + value;
    }
}
