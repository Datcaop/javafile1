package org.example;

import java.sql.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection(
                        "jdbc:postgresql://4.194.217.58:5432/t2301e",
                        "t2301e",
                        "t2301e"
                );

        Statement statement = connection.createStatement();
        statement.executeUpdate("create table caodat ( id   serial constraint caodat primary key, name varchar, dob  date, job  varchar );");
        statement.close();
        connection.close();

    }
}