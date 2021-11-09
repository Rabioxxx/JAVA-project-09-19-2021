package com.company;

public class Animal {
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
        if (this.species.equals("canis")) {
            this.weight = 12.0;
        } else if (this.species.equals("felis")) {
            this.weight = 2.5;
        } else {
            this.weight = 1.0;
        }
        */

        System.out.println("Created new animal " + this.species + ".");
    }

    void IntroduceYourself() {
        System.out.println("I'm " + this.name);
    }

    void doYouLike(String foodType) {
        if (this.species.equals("felis") && foodType.equals("mouse")) {
            System.out.println("Yes, I do like " + foodType);
        } else {
            System.out.println("Nope.");
        }
    }

    Integer getHumanAge() {
        if (this.species.equals("canis")) {
            return this.age * 7;
        } else if (this.species.equals("felis")) {
            return this.age * 10;
        } else {
            return this.age;
        }
    }

    void feed() {
        if (this.alive) {
            this.weight += 1;
            System.out.println("Your pet is now fatter. It weights " + this.weight + ".");
        } else {
            System.out.println("Your pet is dead.");
        }
    }

    void takeForAWalk() {
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

    public String toString(){
        return species + " " + name + " " + weight + " " + age + " " + alive;
    }
}
