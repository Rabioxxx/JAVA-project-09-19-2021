package com.company.devices;

import java.util.Comparator;

public class SortByAge implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return -(car1.getAge() - car2.getAge());
    }
}
