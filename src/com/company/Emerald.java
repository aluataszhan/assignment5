package com.company;

public class Emerald extends Stone{
    private int weight;

    @Override
    public void getInfo() {
        System.out.println("this is Emerald");
    }

    public Emerald(int price) {
        super(price);
    }

    public Emerald(int price, int weight) {
        super(price);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Emerald{" +
                "weight=" + weight +
                '}';
    }
}
