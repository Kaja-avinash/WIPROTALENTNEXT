package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford EcoSport";
    }

    @Override
    public String getRegistrationNumber() {
        return "AP39GH2222";
    }

    @Override
    public String getOwnerName() {
        return "Suresh";
    }

    public int speed() {
        return 160;
    }

    public void tempControl() {
        System.out.println("Air Conditioner Temperature Control is ON.");
    }

}