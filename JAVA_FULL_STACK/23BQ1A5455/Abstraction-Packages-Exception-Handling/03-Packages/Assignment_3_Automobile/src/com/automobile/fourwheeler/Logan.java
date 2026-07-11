package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Logan extends Vehicle {

    @Override
    public String getModelName() {
        return "Logan";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39EF1111";
    }

    @Override
    public String getOwnerName() {
        return "Ramesh";
    }

    public int speed() {
        return 140;
    }

    public void gps() {
        System.out.println("GPS is ON.");
    }

}