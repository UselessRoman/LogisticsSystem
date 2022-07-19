package com.wjc.domain;

public class Car {
    private int car_id;
    private String send_addr;
    private String receive_addr;
    private int capability;
    private String state;

    @Override
    public String toString() {
        return "Car{" +
                "car_id=" + car_id +
                ", send_addr='" + send_addr + '\'' +
                ", receive_addr='" + receive_addr + '\'' +
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

    public String getSend_addr() {
        return send_addr;
    }

    public void setSend_addr(String send_addr) {
        this.send_addr = send_addr;
    }

    public String getReceive_addr() {
        return receive_addr;
    }

    public void setReceive_addr(String receive_addr) {
        this.receive_addr = receive_addr;
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
