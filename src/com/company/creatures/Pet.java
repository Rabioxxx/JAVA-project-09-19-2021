package com.company.creatures;

public class Pet extends Animal {
    private static final Double DEFAULT_FOOD_WEIGHT = 1.0;

    public Pet(String species, String name, Double weight, Integer age) {
        super(species, weight, age);
        this.name = name;
    }

    public void feed() {
        this.feed(DEFAULT_FOOD_WEIGHT);
    }

    public void feed(Double foodWeight) {
        if (this.alive) {
            this.weight += foodWeight;
            System.out.println("Your pet is now fatter. It weights " + this.weight + ".");
        } else {
            System.out.println("Your pet is dead.");
        }
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

            System.out.println(seller.getFullName() + " sold " + this.getFullName() + " to " + buyer.getFullName() + " for " + price + ".");
        }
    }
}
