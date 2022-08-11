package com.tw.parkinglot;

import java.util.ArrayList;

public class ParkingLot {
    public final int capacity;
    public static final String PARKED = "Your car is parked";
    public static final String NOT_PARKED = "Your car is not parked";
    public static final String UNPARKED = "Your car is unparked";
    public static final String CAR_TO_BE_UNPARKED_IS_NOT_PRESENT = "The car you are asking to unpark is not present";

    ArrayList<Object> parkedCars = new ArrayList<>();

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public String park(Object car) throws Exception {
        if (parkedCars.size() < capacity) {
            parkedCars.add(car);
            return PARKED;
        }
        throw new Exception(UNPARKED);
    }

    public String unPark(Object car) throws Exception {
        if (parkedCars.contains(car)) {
            parkedCars.remove(car);
            return UNPARKED;
        }
        throw new Exception(CAR_TO_BE_UNPARKED_IS_NOT_PRESENT);
    }
}
