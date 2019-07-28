package com.learning.factory;

public class CarFactory {

    public CarFactory getInstance(String carType) {
        switch (carType) {
            case "BMW":
                return new BMW();
            case "Honda":
                return new Honda();
            default:
                return null;
        }
    }
}
