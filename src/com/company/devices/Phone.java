package com.company.devices;

import com.company.creatures.Human;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device {
    Double screenSize;
    String os;
    static final String defaultServerURL = "downloadalltheappshere.com";
    static final Integer defaultProtocol = 443;
    static final String defaultVersionName = "v1.0";

    public Phone(String model, String producer, Double value, Integer yearOfProduction, Double screenSize, String os) {
        super(model, producer, value, yearOfProduction);
        this.screenSize = screenSize;
        this.os = os;
    }

    public void installAnApp(String appName) {
        installAnApp(appName, defaultVersionName);
    }

    public void installAnApp(String appName, String version) {
        installAnApp(appName, version, defaultServerURL);
    }

    public void installAnApp(String appName, String version, String server) {

        try {
            URL url = new URL("https", server, defaultProtocol, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    public void installAnApp(List<String> appList) {
        for (String appName : appList) {
            this.installAnApp(appName);
        }
    }

    public void installAnApp(URL url) {
        System.out.println("Installed correctly from " + url + ".");
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
