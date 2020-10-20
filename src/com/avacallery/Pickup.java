package com.avacallery;

public class Pickup extends Car{
    private boolean canMoveFurniture;

    public Pickup(String make, String model, int year,boolean canMoveFurniture) {
        super(make, model, year);
        this.canMoveFurniture = canMoveFurniture;
    }

    @Override
    public String displayCar() {
        return "Good luck on fuel efficiency with yo " + year + " " + make + " " + model + ".";
    }

    public String move() {
            return "Moving will be a piece of cake in your " + year + " " + make + " " + model + ".";
        }
}
