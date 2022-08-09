package com.tw.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    public void shouldReturnTrueIfCarIsParked() {
        Driver driver =  new Driver();

        assertTrue(driver.park());
    }

}