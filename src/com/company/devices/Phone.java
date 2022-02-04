package com.company.devices;

import com.company.creatures.Human;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Phone extends Device {
    private final Double screenSize;
    private final String os;
    private final Human owner;
    private Application[] apps = new Application[0];

    public Phone(Human owner, String model, String producer, Double value, Integer yearOfProduction, Double screenSize, String os) {
        super(model, producer, value, yearOfProduction);
        this.owner = owner;
        this.screenSize = screenSize;
        this.os = os;
    }

    public void installApp(Application app) throws Exception {
        Double cash = this.owner.getCash();
        if (this.isInstalled(app)) {
            throw new Exception(app.getName() + " is already installed!");
        } else if (this.isInstalled(app.getName())) {
            throw new Exception("There is already an app with the same name on the phone!");
        } else if (cash < app.getPrice()) {
            throw new Exception(owner.getFullName() + " has not enough cash to buy this app! Cost: " + app.getPrice() + ", has: " + cash);
        } else {
            Application[] newApps = new Application[this.apps.length + 1];

            System.arraycopy(this.apps, 0, newApps, 0, this.apps.length);

            newApps[this.apps.length] = app;

            this.owner.setCash(cash - app.getPrice());

            this.apps = newApps;
            System.out.println(app.getName() + " has been installed!");
        }
    }

    public boolean isInstalled(Application app) {
        for (Application appCheck : this.apps) {
            if (appCheck.equals(app)) {
                return true;
            }
        }
        return false;
    }

    public boolean isInstalled(String appName) {
        for (Application appCheck : this.apps) {
            if (appCheck.getName().equals(appName)) {
                return true;
            }
        }
        return false;
    }

    public String getAllFreeApps() {
        StringBuilder sum = new StringBuilder();
        for (Application app : this.apps) {
            if (app.getPrice() == 0.0) {
                if (!sum.isEmpty()) {
                    sum.append(", ");
                }
                sum.append(app.getName());
            }
        }
        return sum.toString();
    }

    public String getAllAppsAlphabetically() {
        String[] sArr = getAllAppsArray();
        Arrays.sort(sArr);
        return getAllAppsString(sArr);
    }

    public String getAllAppsByPrice() {
        Application[] appArr = this.apps;
        Arrays.sort(appArr, new SortByPrice());
        String[] sArr = new String[appArr.length];

        for (int i = 0; i < appArr.length; i++) {
            sArr[i] = appArr[i].getName();
        }

        return getAllAppsString(sArr);
    }

    public String getAllAppsString(String[] sArr) {
        StringBuilder sb = new StringBuilder();
        for (String s : sArr) {
            if (!sb.isEmpty()) {
                sb.append(", ");
            }
            sb.append(s);
        }
        return sb.toString();
    }

    public String[] getAllAppsArray() {
        String[] sArr = new String[this.apps.length];
        for (int i = 0; i < this.apps.length; i++) {
            sArr[i] = this.apps[i].getName();
        }
        return sArr;
    }

    public Double getAllAppPrice() {
        Double sum = 0.0;
        for (Application app : this.apps) {
            sum += app.getPrice();
        }
        return sum;
    }

    public void sell(Human seller, Human buyer, Double price) {
    }

    public void turnOn() {
        System.out.println("Włączam telefon.");
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction + " " + value + " " + screenSize + " " + os;
    }
}
