package com.company;

import java.sql.SQLException;
import java.util.Vector;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) throws SQLException {
        StoneFactory factory=new StoneFactory();
        Necklace jewelry= new NecklaceBuilder().giveName("alua").add(factory.createDiamond()).add(factory.createEmerald()).getResult();
        System.out.println(jewelry);

        Vector<Necklace> necklaces = Parser.getNecklacesFromDataBase();

        necklaces.forEach(System.out::println);

        Consumer<Necklace> method = (n) -> System.out.println(n.getName());

        necklaces.forEach(method);
    }
}
