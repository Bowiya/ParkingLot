package com.tw.parkinglot;

import org.junit.jupiter.api.Test;

import static com.tw.parkinglot.ParkingLot.*;
import static org.junit.jupiter.api.Assertions.*;

class ParkingLotTest {
    @Test
    public void shouldReturnYourCarIsParkedMessageWhenTheCarIsParkedInTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(10);
        Object car = new Object();


        assertEquals(PARKED, parkingLot.park(car));
    }

    @Test
    public void shouldReturnYourCarIsNotParkedMessageWhenThereIsNoSpaceAvailableToPark() {
        ParkingLot parkingLot = new ParkingLot(1);
        Object car = new Object();
        parkingLot.park(car);

        assertEquals(NOT_PARKED, parkingLot.park(car));
    }

    @Test
    public void shouldReturnYourCarIsUnparkedMessageWhenTheCarIsUnParkedFromTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();
        parkingLot.park(car);

        assertEquals(UNPARKED, parkingLot.unPark(car));
    }

    @Test
    public void shouldReturnTheCarYouAreAskingToUnparkIsNotPresentMessageWhenTheCarToBeUnParkedIsNotPresentInTheParkingLot() {
        ParkingLot parkingLot = new ParkingLot(5);
        Object car = new Object();

        assertEquals(CAR_TO_BE_UNPARKED_IS_NOT_PRESENT, parkingLot.unPark(car));
    }
}