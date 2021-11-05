package com.company;

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

        Human me = new Human();
        me.firstName = "Szymon";
        me.lastName = "Jasiński";
        me.pet = dog;

        System.out.println("I have a " + me.pet.species);
        System.out.println("I named it " + me.pet.name);

        Car opel = new Car();

        opel.producer = "Opel";
        opel.model = "Astra";
        opel.yearOfProduction = 1993;
        //opel.age = 2021 - opel.yearOfProduction;
        opel.value = 500;

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

        Car nissan = new Car();
        nissan.model = "Micra";
        nissan.producer = "Nissan";
        nissan.yearOfProduction = 2008;
        nissan.value = 10000;

        Car ford = new Car();
        ford.model = "Focus";
        ford.producer = "Ford";
        ford.yearOfProduction = 2006;
        ford.value = 8990;

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

    }
}
