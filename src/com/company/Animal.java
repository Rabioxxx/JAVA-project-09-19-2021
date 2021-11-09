package com.company;

public class Animal implements Sellable {
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

    public void sell(Human seller, Human buyer, Double price) {
        if (this.species.equals("Homo Sapiens")) {
            System.out.println("I'm sorry, unfortunately right now you can't sell humans :/ Please, come back later.");
        } else if (seller.getPet() == null) {
            System.out.println("Seller don't have any pets.");
        } else if (!seller.getPet().equals(this)) {
            System.out.println("Seller doesn't have that pet.");
        } else if (buyer.getCash() < price) {
            System.out.println("Buyer has not enough cash for transaction.");
        } else {
            Double buyersCash = buyer.getCash();
            buyersCash -= price;
            buyer.setCash(buyersCash);

            Double sellersCash = seller.getCash();
            sellersCash += price;
            seller.setCash(sellersCash);

            buyer.setPet(this);

            seller.setPet();

            System.out.println(seller.getName() + " sold " + this.getName() + " to " + buyer.getName() + " for " + price + ".");
        }
    }

    public String getName() {
        return species + " " + name;
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

    public String toString() {
        return species + " " + name + " " + weight + " " + age + " " + alive;
    }
}
