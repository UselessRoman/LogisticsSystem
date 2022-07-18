package com.wjc.domain;

public class Package
{
    private int package_id;
    private String send_addr;
    private String receive_addr;
    private int sender_id;
    private int receiver_id;
    private int weight;
    private int price;
    private int car_id;
    private String status;

    public int getPackage_id() {
        return package_id;
    }

    public void setPackage_id(int package_id) {
        this.package_id = package_id;
    }

    @Override
    public String toString() {
        return "Package{" +
                "package_id=" + package_id +
                ", send_addr='" + send_addr + '\'' +
                ", receive_addr='" + receive_addr + '\'' +
                ", sender_id=" + sender_id +
                ", receiver_id=" + receiver_id +
                ", weight=" + weight +
                ", price=" + price +
                ", car_id=" + car_id +
                ", status='" + status + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return package_id;
    }

    public void setId(int id) {
        this.package_id = id;
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

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public int getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(int receiver_id) {
        this.receiver_id = receiver_id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }
}
