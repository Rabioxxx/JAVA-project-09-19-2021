package com.company.devices;

import java.util.Comparator;

public class SortByPrice implements Comparator<Application> {
    @Override
    public int compare(Application o1, Application o2) {
        int price1 = (int) Math.floor(o1.getPrice() * 100);
        int price2 = (int) Math.floor(o2.getPrice() * 100);

        return -(price1 - price2);
    }
}
