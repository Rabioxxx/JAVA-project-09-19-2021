package com.company.creatures;

import com.company.creatures.Animal;
import com.company.creatures.Edible;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species, Double weight, Integer age) {
        super(species, weight, age);
    }

    public void beEaten() {
    }

    public void feed() {
    }

    public void feed(Double foodWeight) {
    }
}
