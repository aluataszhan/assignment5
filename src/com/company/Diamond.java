package com.company;


public class Diamond extends Stone {
    private int carat;

    @Override
    public void getInfo() {
        System.out.println("this is diamond");
    }

    public Diamond(int price) {
        super(price);
    }

    public Diamond(int price, int carat) {
        super(price);
        this.carat = carat;
    }

    public int getCarat() {
        return carat;
    }

    public void setCarat(int carat) {
        this.carat = carat;
    }

    @Override
    public String toString() {
        return "Diamond{" +
                "carat=" + carat +
                '}';
    }
}
