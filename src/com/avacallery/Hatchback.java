package com.avacallery;

public class Hatchback extends Car {
    private boolean isCool = true;

    public Hatchback(String make, String model, int year, boolean isCool) {
        super(make, model, year);
        this.isCool = isCool;
    }

    public String moveYourGear() {
        return "You've successfully fit all your gear in your "+ year +" "+ make +" "+ model +". Get to the gig!";
    }

    @Override
    public String displayCar() {
        return "Sweet ride!!!";
    }
}
