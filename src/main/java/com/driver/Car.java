package com.driver;

public class Car extends Vehicle {
    private int wheels; // number of wheels
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public int getSeats(){
        return seats;
    }

    public String getType(){
        return type;
    }

    public int getWheels(){
        return wheels;
    }

    public int getDoors(){
        return doors;
    }

    public int getGears(){
        return gears;
    }

    public int getCurrentGear(){
        return currentGear;
    }

    public boolean isManual(){
        return isManual;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
