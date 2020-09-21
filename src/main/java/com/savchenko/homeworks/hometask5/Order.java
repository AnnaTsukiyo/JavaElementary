package com.savchenko.homeworks.hometask5;

import java.util.Date;

public class Order {
    private String item;
    private double size;
    private int price;
    private Date deliveryDate;

    public Order(String item, double size, int price, Date deliveryDate) {
        this.item = item;
        this.size = size;
        this.price = price;
        this.deliveryDate = deliveryDate;
    }


    public String setItem() {
        return item;
    }

    public double setSize() {
        return size;
    }

    public int setPrice() {
        return price;
    }

    public Date setDeliveryDate(String date) {
        return deliveryDate;
    }

    public String getItem() {

        return item;
    }

    public double getSize() {

        return size;
    }

    public int getPrice() {
        return price;
    }

    public Date getDeliveryDate(Date deliveryDate) {

        return deliveryDate;
    }

    public String toString() {
        return "Order {" +
                "item = '" + item + '\'' +
                ", size = '" + size + '\'' + " kg" +
                ", price = '" + price + '\'' + " UAH " +
                ", date of delivery = '" + deliveryDate + '\'' +
                '}';
    }

}

