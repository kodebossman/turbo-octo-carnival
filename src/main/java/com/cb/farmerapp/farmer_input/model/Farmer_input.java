package com.cb.farmerapp.farmer_input.model;

public class Farmer_input {
    private int fertiliser;
    private int fuel;
    private int wages;
    private String seedVar;

    public Farmer_input(int fertiliser, int fuel, int wages, String seedVar) {
        this.fertiliser = fertiliser;
        this.fuel = fuel;
        this.wages = wages;
        this.seedVar = seedVar;
    }

    public int getFertiliser() {
        return fertiliser;
    }

    public void setFertiliser(int fertiliser) {
        this.fertiliser = fertiliser;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public String getSeedVar() {
        return seedVar;
    }

    public void setSeedVar(String seedVar) {
        this.seedVar = seedVar;
    }
}
