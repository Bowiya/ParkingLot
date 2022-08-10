package com.tw.parkinglot;

import java.util.ArrayList;

public class ParkingLot {
    public final int capacity;

    ArrayList<Object> parkedCars = new ArrayList<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public String park(Object car) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            return "Your car is parked";
        }
        return "Your car is not parked";
    }

    public String unPark(Object car) {
        if (parkedCars.contains(car)) {
            parkedCars.remove(car);
            return "Your car is unparked";
        }
        return "The car you are asking to unpark is not present";
    }
}
