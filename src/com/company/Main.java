package com.company;

import com.company.vehicles.Car;
import com.company.vehicles.CarComparator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Chevrolet", "Impala 64", "Red"));
        cars.add(new Car("Toyota", "Camry", "Blue"));
        cars.add(new Car("Chevrolet", "Silverado", "Black"));
        cars.add(new Car("Chevrolet", "Impala 63", "Red"));
        cars.add(new Car("Chevrolet", "Impala 64", "Red"));
        cars.add(new Car("Nissan", "GT-R V-Spec II", "Blue"));
        cars.add(new Car("Mitsubishi", "Lancer Evolution X", "White"));

        cars.sort(new CarComparator());

        cars.forEach(x -> System.out.println(x.toString()));
    }
}


