package com.company;

public interface Sellable {
    // everything here is public and abstract.
    void sell(Human seller, Human buyer, Double price);
}
