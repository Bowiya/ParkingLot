package com.tw.parkinglot;

public class CarNotParkedException extends Exception {
    public CarNotParkedException(String message) {
        super(message);
    }
}
