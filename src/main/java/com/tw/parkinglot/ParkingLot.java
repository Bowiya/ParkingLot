package com.tw.parkinglot;

import java.util.ArrayList;

public class ParkingLot {
    public final int capacity;

    ArrayList<Object> parkedCars = new ArrayList<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public boolean park(Object car) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            return true;
        }
        return false;
    }

    public boolean unPark(Object car) {
        if (parkedCars.contains(car)) {
            parkedCars.remove(car);
            return true;
        }
        return false;
    }
}
