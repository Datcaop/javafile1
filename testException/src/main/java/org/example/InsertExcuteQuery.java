package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertExcuteQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection(
                        "jdbc:postgresql://4.194.217.58:5432/t2301e",
                        "t2301e",
                        "t2301e"
                );

        Statement statement = connection.createStatement();
        for (int i = 0; i < 100; i++) {
            statement.executeUpdate("insert into \"Datcao\" (name,dob,job) values ('datcao','2023-08-17','abc')");
        }

    }
}
