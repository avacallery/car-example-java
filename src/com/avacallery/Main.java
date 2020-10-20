package com.avacallery;

import com.avacallery.Car;

public class Main {

    public static void main(String[] args) {
	Car myCar = new Car("Subaru", "Impreza", 2016);
	Hatchback myHatchback = new Hatchback("Subaru", "Outback", 2008, true);
	Pickup myPickup = new Pickup("Toyota", "Tundra", 2020, true);
        System.out.println(myCar.displayCar());
        System.out.println(myHatchback.displayCar());
        System.out.println(myHatchback.moveYourGear());
        System.out.println(myPickup.displayCar());
        System.out.println(myPickup.move());
    }
}
