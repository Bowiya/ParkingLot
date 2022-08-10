package com.tw.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    public void shouldReturnTrueWhenTheCarIsParkedInTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(10);
        Object car = new Object();

        assertTrue(parkingLot.park(car));
    }

    @Test
    public void shouldReturnFalseWhenThereIsNoSpaceAvailableToPark() {
        ParkingLot parkingLot = new ParkingLot(1);
        Object car = new Object();
        parkingLot.park(car);

        assertFalse(parkingLot.park(car));
    }

    @Test
    public void shouldReturnTrueWhenTheCarIsUnParkedFromTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();
        parkingLot.park(car);

        assertTrue(parkingLot.unPark(car));
    }

    @Test
    public void shouldReturnFalseWhenTheCarIsNotPresentInTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();

        assertFalse(parkingLot.unPark(car));
    }
}