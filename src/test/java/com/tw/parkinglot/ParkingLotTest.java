package com.tw.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    public void shouldReturnTrueWhenTheCarIsParkedInTheParkingLot(){
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
}