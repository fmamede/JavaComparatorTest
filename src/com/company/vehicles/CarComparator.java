package com.company.vehicles;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    public int compare(Car c1, Car c2) {
        if (c1.getCarManufacturer().compareToIgnoreCase(c2.getCarManufacturer()) != 0) {
            return c1.getCarManufacturer().compareToIgnoreCase(c2.getCarManufacturer())
                    < c2.getCarManufacturer().compareToIgnoreCase(c1.getCarManufacturer())
                    ? -1 : 1;
        }

        if (c1.getCarModel().compareToIgnoreCase(c2.getCarModel()) != 0) {
            return c1.getCarModel().compareToIgnoreCase(c2.getCarModel())
                    < c2.getCarModel().compareToIgnoreCase(c1.getCarModel())
                    ? -1 : 1;
        }

        return c1.getCarColor().compareToIgnoreCase(c2.getCarColor())
                < c2.getCarColor().compareToIgnoreCase(c1.getCarColor())
                ? -1 : 1;
    }
}
