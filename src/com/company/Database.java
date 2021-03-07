package com.company;

//Singleton

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    private static Database instance;
    private Connection connection;

    private Database() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/jewelry?useUnicode=true&serverTimezone=UTC";
            String username = "root";
            String password = "";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static Database getInstance() throws SQLException {
        if (instance == null) {
            instance = new Database();
        } else if (instance.getConnection().isClosed()) {
            instance = new Database();
        }
        return instance;
    }

    public static ResultSet query(String sql) throws SQLException {
        return Database.getInstance().getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY).executeQuery(sql);
    }
}
