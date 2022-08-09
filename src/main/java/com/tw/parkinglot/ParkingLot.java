package com.tw.parkinglot;

import java.util.ArrayList;

public class ParkingLot {
    public int capacity;

    ArrayList<Object> parkedCars = new ArrayList<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public boolean park(Object obj) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(obj);
            return true;
        }
        return false;
    }
}
