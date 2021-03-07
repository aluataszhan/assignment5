package com.company;

public class Sapphire extends Stone{
    private int color;//1-red , 2-blue , 3-yellow
    @Override
    public void getInfo() {
        System.out.println("this is sapphire");
    }

    public Sapphire(int price) {
        super(price);
    }

    public Sapphire(int price, int color) {
        super(price);
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sapphire{" +
                "color=" + color +
                '}';
    }
}
