package com.company;

import com.company.creatures.Human;

public interface Sellable {
    // everything here is public and abstract.
    void sell(Human seller, Human buyer, Double price);
}
