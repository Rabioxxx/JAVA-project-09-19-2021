package com.company.creatures;

import com.company.Sellable;

public abstract class Animal implements Sellable, Feedable {
    String species;
    String name;
    Double weight;
    Integer age;
    Boolean alive;

    Animal(String species, Double weight, Integer age) {
        this.species = species;
        this.weight = weight;
        this.age = age;
        this.alive = true;

        /*
        // I do not need it, because the weight is required in constructor now and can be different that these values.
        if (this.species == "Homo Sapiens"){
            this.weight = 70.0;
        }else
        if (this.species.equals("Canis")) {
            this.weight = 12.0;
        } else if (this.species.equals("Felis")) {
            this.weight = 2.5;
        } else {
            this.weight = 1.0;
        }
        */

        System.out.println("Created new animal " + this.species + ".");
    }

    public void sell(Human seller, Human buyer, Double price) {
    }

    public String getFullName() {
        return species + " " + name;
    }

    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public Double getWeight() {
        return weight;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getAlive() {
        return alive;
    }

    public void IntroduceYourself() {
        System.out.println("I'm " + this.name);
    }

    public void doYouLike(String foodType) {
        if (this.species.equals("Felis") && foodType.equals("mouse")) {
            System.out.println("Yes, I do like " + foodType);
        } else if (this.species.equals("Canis")) {
            System.out.println("Nope.");
        }
    }

    public Integer getHumanAge() {
        if (this.species.equals("Canis")) {
            return this.age * 7;
        } else if (this.species.equals("Felis")) {
            return this.age * 10;
        } else {
            return this.age;
        }
    }

    public void feed() {

    }

    public void takeForAWalk() {
        if (this.alive) {
            this.weight -= 1;
            if (this.weight <= 0) {
                this.alive = false;
                System.out.println("You killed your pet >:(");
            } else {
                System.out.println("Your pet is now skinner. It weights " + this.weight + ".");
            }
        } else {
            System.out.println("Cannot, pet is dead.");
        }
    }

    public String toString() {
        return species + " " + name + " " + weight + " " + age + " " + alive;
    }
}
