package com.company.devices;

import com.company.creatures.Human;

public abstract class Car extends Device {
    Integer age;

    public Car(String model, String producer, Double value, Integer yearOfProduction, Integer age) {
        super(model, producer, value, yearOfProduction);
        this.age = age;
    }

    abstract void refuel();

    public void sell(Human seller, Human buyer, Double price) {
        if (seller.getCar() == null) {
            System.out.println("Seller don't have any cars.");
        } else if (!seller.getCar().equals(this)) {
            System.out.println("Seller doesn't have that car.");
        } else if (buyer.getCash() < price) {
            System.out.println("Buyer has not enough cash for transaction.");
        } else {
            Double buyersCash = buyer.getCash();
            buyersCash -= price;
            buyer.setCash(buyersCash);

            Double sellersCash = seller.getCash();
            sellersCash += price;
            seller.setCash(sellersCash);

            buyer.setCar(this);

            seller.setCar();

            System.out.println(seller.getFullName() + " sold " + this.getName() + " to " + buyer.getFullName() + " for " + price + ".");
        }
    }

    public void turnOn() {
        System.out.println("Przekręcam kluczyk.");
    }

    public String getName() {
        return producer + " " + model;
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

    public Double getValue() {
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

    public void setValue(Double value) {
        this.value = value;
    }

    public Boolean equals(Car car) {
        if (this == car) {
            return true;
        } else
            return this.producer.equals(car.producer) && this.model.equals(car.model) && this.yearOfProduction.equals(car.yearOfProduction) && this.age.equals(car.age) && this.value.equals(car.value);
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction + " " + value + " " + age;
    }
}
