package com.company;

public abstract class Stone {
    public abstract void getInfo();
    private int price;


    public Stone(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "price=" + price +
                '}';
    }
}
