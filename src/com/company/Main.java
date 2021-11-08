package com.company;

import com.company.devices.Car;
import com.company.devices.Device;

public class Main {

    public static void main(String[] args) {
        Integer x = 3;
        Animal dog = new Animal("canis");
        Animal cat = new Animal("felis");

        dog.name = "Szarik";
        dog.weight = 6.5;
        dog.age = 5;

        System.out.println(dog.name);

        cat.name = "Siersciuch";
        System.out.println("a kot zyje? " + cat.alive);
        System.out.println("waga kota: " + cat.weight);
        cat.IntroduceYourself();
        dog.IntroduceYourself();

        cat.doYouLike("mouse");
        dog.doYouLike("mouse");

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'd be human, I'd be " + humanAge + " years old.");

        Human me = new Human("Szymon", "Jasiński", 1300.0);
        me.pet = dog;

        System.out.println("I have a " + me.pet.species);
        System.out.println("I named it " + me.pet.name);

        Car opel = new Car("Astra", "Opel", 500, 1993, 2021-1993);

        //opel.setProducer("Opel");
        //opel.setModel("Astra");
        //opel.setYearOfProduction(1993);
        //opel.age = 2021 - opel.yearOfProduction;
        opel.setValue(500);

        //me.car = opel;

        //System.out.println("I have a car " + me.car.producer + " " + me.car.model + " manufactured in " + me.car.yearOfProduction + " which is now " + me.car.age + " years old.");
        //System.out.println("I bought it for " + me.car.value + " USD.");

        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();

        me.setSalary(-1.0);
        me.setSalary(0.0);
        me.setSalary(1500.0);
        me.getSalary();

        Car nissan = new Car("Micra", "Nissan", 10000, 2008, 2021-2008);
        /*nissan.setModel("Micra");
        nissan.setProducer("Nissan");
        nissan.setYearOfProduction(2008);
        nissan.setValue(10000);*/

        Car ford = new Car("Focus", "Ford", 8990, 2006, 2021-2006);
        /*ford.setModel("Focus");
        ford.setProducer("Ford");
        ford.setYearOfProduction(2006);
        ford.setValue(8990);*/

        me.setCar(nissan);
        me.getCar();

        /*String model;
        String producer;
        Integer yearOfProduction;
        Integer age;
        Integer value;*/

        System.out.println(nissan.equals(nissan));
        System.out.println(nissan == nissan);
        System.out.println(nissan.equals(ford));
        System.out.println(nissan == ford);

        System.out.println(opel.hashCode());
        System.out.println(nissan.hashCode());
        System.out.println(ford.hashCode()); //satan!!!!

        System.out.println(dog.toString());
        System.out.println(opel.toString());
        System.out.println(me.toString());

        //Device washingMachine = new Device("GG606", "Bosh", 1200, 2020); //class is abstract.

        Human jan = new Human("Jan", "Kowalski", 2500.0);
        System.out.println(me.getCar());
        nissan.sell(me, jan, 600.0);
    }
}
