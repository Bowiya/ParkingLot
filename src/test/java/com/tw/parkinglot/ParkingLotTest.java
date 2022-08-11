package com.tw.parkinglot;

import org.junit.jupiter.api.Test;

import static com.tw.parkinglot.ParkingLot.*;
import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    public void shouldReturnYourCarIsParkedMessageWhenTheCarIsParkedInTheParkingLot() throws CarNotParkedException {
        ParkingLot parkingLot = new ParkingLot(10);
        Object car = new Object();

        assertEquals(PARKED, parkingLot.park(car));
    }

    @Test
    public void shouldReturnTheExceptionMessageWhenTheCarIsNotParked() throws CarNotParkedException {
        ParkingLot parkingLot = new ParkingLot(1);
        Object car = new Object();
        parkingLot.park(car);

        Exception thrown = assertThrows(Exception.class, () -> {
            parkingLot.park(car);
        });

        assertEquals(NOT_PARKED, thrown.getMessage());
    }

    @Test
    public void shouldReturnUnparkedMessageWhenTheCarIsUnParkedFromTheParkingLot() throws CarNotParkedException, CarNotPresentException {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();
        parkingLot.park(car);

        assertEquals(UNPARKED, parkingLot.unPark(car));
    }

    @Test
    public void shouldReturnTheExceptionMessageWhenTheCarToBeUnparkedIsNotPresent() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();

        Exception thrown = assertThrows(Exception.class, () -> {
            parkingLot.unPark(car);
        });

        assertEquals(CAR_TO_BE_UNPARKED_IS_NOT_PRESENT, thrown.getMessage());
    }
}