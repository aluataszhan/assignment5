package com.company;

public class StoneFactory {
    public Stone createDiamond(){
        return new Diamond(150000,1);
    }
    public Stone createSapphire(){
        return new Sapphire(2100000,1);
    }
    public Stone createEmerald(){
        return new Emerald(420000,200);
    }


}
