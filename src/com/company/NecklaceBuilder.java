package com.company;

import java.util.Vector;

public class NecklaceBuilder {
    private Necklace necklace;

    public NecklaceBuilder() {
        necklace = new Necklace();
    }

    public Necklace getNecklace() {
        return necklace;
    }

    public void setNecklace(Necklace necklace) {
        this.necklace = necklace;
    }

    public NecklaceBuilder giveName(String name) {
        necklace.setName(name);
        return this;
    }

    public NecklaceBuilder reset() {
        necklace = new Necklace();
        return this;
    }

    public NecklaceBuilder add(Stone stone) {
        Vector<Stone> stones = necklace.getStone();
        stones.add(stone);
        necklace.setStone(stones);
        return this;
    }

    public Necklace getResult() {
        return necklace;
    }

}
