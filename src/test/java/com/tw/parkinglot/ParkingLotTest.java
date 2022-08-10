package com.tw.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    public void shouldReturnTrueWhenTheCarIsParkedInTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(10);
        Object car = new Object();


        assertEquals("Your car is parked", parkingLot.park(car));
    }

    @Test
    public void shouldReturnFalseWhenThereIsNoSpaceAvailableToPark() {
        ParkingLot parkingLot = new ParkingLot(1);
        Object car = new Object();
        parkingLot.park(car);

        assertEquals("Your car is not parked", parkingLot.park(car));
    }

    @Test
    public void shouldReturnTrueWhenTheCarIsUnParkedFromTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();
        parkingLot.park(car);

        assertEquals("Your car is unparked", parkingLot.unPark(car));
    }

    @Test
    public void shouldReturnFalseWhenTheCarToBeUnParkedIsNotPresentInTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();

        assertEquals("The car you are asking to unpark is not present", parkingLot.unPark(car));
    }
}