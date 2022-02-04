package com.company;

import com.company.creatures.*;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //Integer x = 3;
        Pet dog = new Pet("Canis", "Molly", 6.5, 5);
        Pet cat = new Pet("Felis", "Siersciuch", 3.0, 8);

        //dog.name = "Szarik"; // Doesn't work anymore.
        //dog.weight = 6.5; // Doesn't work anymore.
        //dog.age = 5; // Doesn't work anymore.

        //System.out.println(dog.name); // Doesn't work anymore. Changes are line below:
        System.out.println(dog.getName());

        //cat.name = "Siersciuch"; // Doesn't work anymore.
        //System.out.println("a kot zyje? " + cat.alive); // Doesn't work anymore. Changes are line below:
        System.out.println("a kot zyje? " + cat.getAlive());
        //System.out.println("waga kota: " + cat.weight); // Doesn't work anymore. Changes are line below:
        System.out.println("waga kota: " + cat.getWeight());
        cat.IntroduceYourself();
        dog.IntroduceYourself();

        cat.doYouLike("mouse");
        dog.doYouLike("mouse");

        Integer humanAge = dog.getHumanAge();
        System.out.println("If I'd be human, I'd be " + humanAge + " years old.");

        Human me = new Human("Szymon", "Jasiński", 64.0, 22, 1300.0, 10000.0, 0.0);
        me.pet = dog;

        //System.out.println("I have a " + me.pet.species); // Doesn't work anymore. Changes are line below:
        System.out.println("I have a " + me.pet.getSpecies());
        //System.out.println("I named it " + me.pet.name); // Doesn't work anymore. Changes are line below:
        System.out.println("And I named it " + me.pet.getName());

        Car opel = new Diesel("Astra", "Opel", 500.0, 1993, 2021 - 1993, me);

        //opel.setProducer("Opel");
        //opel.setModel("Astra");
        //opel.setYearOfProduction(1993);
        //opel.age = 2021 - opel.yearOfProduction;
        opel.setValue(500.0);

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

        Car nissan = new Diesel("Micra", "Nissan", 10000.0, 2008, 2021 - 2008, me);
        /*nissan.setModel("Micra");
        nissan.setProducer("Nissan");
        nissan.setYearOfProduction(2008);
        nissan.setValue(10000);*/

        Car ford = new Diesel("Focus", "Ford", 8990.0, 2006, 2021 - 2006, me);
        /*ford.setModel("Focus");
        ford.setProducer("Ford");
        ford.setYearOfProduction(2006);
        ford.setValue(8990);*/

        //me.setCar(nissan);
        //me.getCar();

        /*String model;
        String producer;
        Integer yearOfProduction;
        Integer age;
        Integer value;*/

        /*
        System.out.println("Comparing Objects from zadanie 6., .equals(), .hashcode().");

        System.out.println(nissan.equals(nissan));
        System.out.println(nissan == nissan);
        System.out.println(nissan.equals(ford));
        System.out.println(nissan == ford);

        System.out.println(opel.hashCode());
        System.out.println(nissan.hashCode());
        System.out.println(ford.hashCode()); //satan!!!!

        System.out.println(dog);
        System.out.println(opel);
        System.out.println(me);
        */

        //Device washingMachine = new Device("GG606", "Bosh", 1200, 2020); //class is abstract.

        // Here I am adding more Humans if I need them.
        Human jan = new Human("Jan", "Kowalski", 110.0, 44, 2500.0, 2000.0, 10000.0);
        Human someRandomGuy = new Human("Random", "Guy", 50.0, 33, 5000.0, 660500.0, 25000.0);

        me.addCarToGarage(nissan);

        //System.out.println(me.getCar());
        nissan.sell(me, jan, 600.0);
        //nissan.sell(me, jan, 800.0); //tested for throwing exceptions

        me.setPet(cat);
        jan.sell(me, someRandomGuy, 600000.0);
        dog.sell(me, someRandomGuy, 4500.0);
        cat.sell(me, someRandomGuy, 150.0);

        Phone phone = new Phone(me, "Galaxy M21", "Samsung", 999.0, 2020, 6.5, "Android");

        me.addCarToGarage(ford);
        me.addCarToGarage(nissan);
        me.addCarToGarage(opel);

        System.out.println("unsorted garage:");
        for (int i = 0; i < me.getGarage().length; i++) {
            System.out.println(me.getCarFromGarage(i));
        }

        me.sortCarsInGarageByAge();

        System.out.println("sorted garage by age:");
        for (int i = 0; i < me.getGarage().length; i++) {
            System.out.println(me.getCarFromGarage(i));
        }

        //nissan.sell(jan, me, 500.0); //checking "throw" for empty space in garage.

        nissan.sell(me, someRandomGuy, 600.0);
        nissan.sell(someRandomGuy, me, 600.0);
        nissan.sell(me, jan, 600.0);
        nissan.sell(jan, me, 600.0);
        nissan.sell(me, jan, 600.0);
        nissan.sell(jan, me, 600.0);
        nissan.sell(me, jan, 600.0);
        nissan.sell(jan, me, 600.0);
        nissan.sell(me, jan, 600.0);
        nissan.sell(jan, me, 600.0);

        System.out.println(nissan.checkPastOwnership(jan));
        System.out.println(nissan.checkIfASoldToB(someRandomGuy, jan));
        System.out.println(nissan.checkIfASoldToB(someRandomGuy, me));
        System.out.println(nissan.checkIfASoldToB(me, jan));
        System.out.println(nissan.checkIfASoldToB(me, someRandomGuy));
        System.out.println(nissan.soldCount());

        Application facebookApp = new Application("Facebook");
        Application instagramApp = new Application("Instagram");
        Application scamApp = new Application("Not scam 100% free", "v6.9", 6.99);
        Application mieczeISandaly = new Application("Miecze I Sandały", 31.99);
        Application mostExpensiveGame = new Application("The Most Expensive Game", 999.99);
        Application pacman = new Application("Pac-Man", "v0.99");
        Application wsbApp = new Application("WSB App", "v1.1.5442");

        phone.installApp(wsbApp);
        phone.installApp(mieczeISandaly);
        phone.installApp(instagramApp);
        phone.installApp(pacman);
        phone.installApp(mostExpensiveGame);
        phone.installApp(scamApp);
        phone.installApp(facebookApp);

        System.out.println(phone.isInstalled(facebookApp));
        System.out.println(phone.isInstalled(scamApp));
        System.out.println(phone.getAllFreeApps());
        System.out.println(phone.getAllAppPrice());

        System.out.println(phone.getAllAppsAlphabetically());
        System.out.println(phone.getAllAppsByPrice());
    }
}
