package com.avacallery;

public class Car {
    // benefit of changing these to private?
    protected String make;
    protected String model;
    protected int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String displayCar() {
        return "Your vehicle is a " + year + " " + make + " " + model + ".";
    }
}
