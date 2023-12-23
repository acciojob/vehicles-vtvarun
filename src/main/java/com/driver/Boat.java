package com.driver;

public class Boat implements WaterVehicle{

    int capacity;

    String name;

    public Boat(String name, int capacity){
        this.capacity = capacity;
        this.name = name;
    }
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

}
