package com.tw.parkinglot;

public class CarNotPresentException extends Exception {
    public CarNotPresentException(String message) {
        super(message);
    }
}
