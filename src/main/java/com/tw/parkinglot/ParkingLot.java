package com.tw.parkinglot;

import java.util.ArrayList;

public class ParkingLot {
    public final int capacity;
    public final String PARKED = "Your car is parked";
    public final String NOT_PARKED = "Your car is not parked";
    public final String UNPARKED = "Your car is unparked";
    public final String CAR_TO_BE_UNPARKED_IS_NOT_PRESENT = "The car you are asking to unpark is not present";

    ArrayList<Object> parkedCars = new ArrayList<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public String park(Object car) {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            return PARKED;
        }
        return NOT_PARKED;
    }

    public String unPark(Object car) {
        if (parkedCars.contains(car)) {
            parkedCars.remove(car);
            return UNPARKED;
        }
        return CAR_TO_BE_UNPARKED_IS_NOT_PRESENT;
    }
}
