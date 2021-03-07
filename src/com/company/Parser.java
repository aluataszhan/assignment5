package com.company;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Parser {
    public static Vector<Stone> getStonesOfNecklaceById(int id) throws SQLException {
        ResultSet rs = Database
                .getInstance()
                .getConnection()
                .createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
                .executeQuery("SELECT * FROM plane WHERE necklace_id = " + id);
        Vector<Stone> temp = new Vector<>();
        StoneFactory stoneFactory = new StoneFactory();
        while (rs.next()) {
            if(rs.getString("type").equals("Diamond")){
                temp.add(stoneFactory.createDiamond());
            }
            if(rs.getString("type").equals("Emerald")){
                temp.add(stoneFactory.createEmerald());
            }
            if(rs.getString("type").equals("Sapphire")){
                temp.add(stoneFactory.createSapphire());
            }
        }
        return temp;
    }

    public static Vector<Necklace> getNecklacesFromDataBase() throws SQLException {
        ResultSet rs = Database
                .getInstance()
                .getConnection()
                .createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)
                .executeQuery("SELECT * FROM plane");
        Vector<Necklace> temp = new Vector<>();
        while (rs.next()) {
            temp.add(new Necklace(rs.getString("name"), getStonesOfNecklaceById(rs.getInt("necklace_id"))));
        }
        return temp;
    }
}
