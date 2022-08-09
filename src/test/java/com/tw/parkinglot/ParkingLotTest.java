package com.tw.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    public void shouldReturnTrueWhenTheCarIsParkedInTheParkingLot(){
        ParkingLot parkingLot = new ParkingLot(10);
        Car car = new Car();

        assertTrue(parkingLot.park(car));
    }

    @Test
    public void shouldReturnFalseWhenTheCapacityOfTheParkingLotIsZero() {
        ParkingLot parkingLot = new ParkingLot(0);
        Car car = new Car();

        assertFalse(parkingLot.park(car));
    }
}