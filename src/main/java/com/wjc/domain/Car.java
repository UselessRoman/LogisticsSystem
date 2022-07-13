package com.wjc.domain;

public class Car {
    private int car_id;
    private String location;
    private int capability;
    private String state;

    @Override
    public String toString() {
        return "Car{" +
                "car_id=" + car_id +
                ", location='" + location + '\'' +
                ", capability=" + capability +
                ", state='" + state + '\'' +
                '}';
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapability() {
        return capability;
    }

    public void setCapability(int capability) {
        this.capability = capability;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
