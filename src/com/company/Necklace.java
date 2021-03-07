package com.company;

import java.util.Vector;

public class Necklace {
    private int id ;
    private String name;
    private Vector<Stone> stone;
    private static int countId=0;

    public Necklace() {
        id=countId;
        countId++;
        name="unnamed";
        stone=new Vector<>();
    }

    public Necklace(String name, Vector<Stone> stone) {
        id=countId;
        countId++;
        this.name = name;
        this.stone = stone;
    }

    public Necklace(String name) {
        id=countId;
        countId++;
        this.name = name;
        stone = new Vector<>();
    }

    public Necklace(int id, String name, Vector<Stone> stone) {
        this.id = id;
        this.name = name;
        this.stone = stone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Stone> getStone() {
        return stone;
    }

    public void setStone(Vector<Stone> stone) {
        this.stone = stone;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stone=" + stone +
                '}';
    }
}
