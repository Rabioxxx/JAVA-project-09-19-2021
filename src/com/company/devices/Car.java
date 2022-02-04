package com.company.devices;

import com.company.creatures.Human;

import java.awt.List;

public abstract class Car extends Device {
    private final Integer age;
    private final List ownershipList;

    public Car(String model, String producer, Double value, Integer yearOfProduction, Integer age, Human firstOwner) {
        super(model, producer, value, yearOfProduction);
        this.age = age;
        this.ownershipList = new List();
        this.ownershipList.add(firstOwner.getFullName());
    }

    abstract void refuel();

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.checkForCarInGarage(this)) {
            //System.out.println("Seller doesn't have that car.");
            throw new Exception("Seller doesn't have that car!");
        } else if (this.checkOwnership(seller)) {
            throw new Exception("Seller isn't owner of that car!");
        } else if (!buyer.checkForFreeSpaceInGarage()) {
            throw new Exception("Buyer doesn't have empty space in garage!");
        } else if (buyer.getCash() < price) {
            //System.out.println("Buyer has not enough cash for transaction.");
            throw new Exception("Buyer has not enough cash for transaction!");
        } else {
            Double buyersCash = buyer.getCash();
            buyersCash -= price;
            buyer.setCash(buyersCash);

            Double sellersCash = seller.getCash();
            sellersCash += price;
            seller.setCash(sellersCash);

            seller.removeCarFromGarage(this);

            buyer.addCarToGarage(this);

            this.ownershipList.add(buyer.getFullName());

            System.out.println(seller.getFullName() + " sold " + this.getName() + " to " + buyer.getFullName() + " for " + price + ".");
        }
    }

    public boolean checkPastOwnership(Human human){
        int x = this.ownershipList.getItemCount();
        String humanName = human.getFullName();
        for (int i = 0; i < x - 1; i++) {
            if (this.ownershipList.getItem(i).equals(humanName)){
                return true;
            }
        }
        return false;
    }

    public boolean checkOwnership(Human human) {
        int x = this.ownershipList.getItemCount();
        return this.ownershipList.getItem(x - 1) == (human.getFullName());
    }

    public boolean checkIfASoldToB(Human a, Human b){
        int x = this.ownershipList.getItemCount();
        if (x != 1) {
            String aName = a.getFullName();
            String bName = b.getFullName();
            for (int i = 1; i < x - 1; i++) {
                if (this.ownershipList.getItem(i - 1).equals(aName) && this.ownershipList.getItem(i).equals(bName)){
                    return true;
                }
            }
        }
        return false;
    }

    public Integer soldCount(){
        return this.ownershipList.getItemCount();
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
