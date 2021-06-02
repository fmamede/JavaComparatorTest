package com.company.vehicles;

public class Car {
    private String carManufacturer;
    private String carModel;
    private String carColor;

    public Car(String manufacturer, String model, String color)
    {
        this.carManufacturer = manufacturer;
        this.carModel = model;
        this.carColor = color;
    }

    @Override
    public String toString()
    {
        return carColor + " " + carManufacturer + " " + carModel;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarColor() {
        return carColor;
    }
}
