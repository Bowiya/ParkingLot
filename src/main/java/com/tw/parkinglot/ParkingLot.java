package com.tw.parkinglot;

import java.util.ArrayList;

public class ParkingLot {

    public int capacity;


    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }
    ArrayList<Car> parkedCars=new ArrayList<>();

    public boolean park(Car car) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            return true;
        }
        return false;
    }
}
