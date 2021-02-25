package com.amrita;

public class problem {
    private String name;
    private String author;
    private double price;
    private int qty;

    public problem(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public problem(String name, String author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

}
