package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchMain {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection(
                        "jdbc:postgresql://4.194.217.58:5432/t2301e",
                        "t2301e",
                        "t2301e"
                );

        Statement statement = connection.createStatement();

        connection.setAutoCommit(false);
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            statement.addBatch("insert into \"Datcao\" (name,dob,job) values ('datcao','2023-08-17','abc')");
        }
        int[] count = statement.executeBatch();

        connection.commit();

        statement.close();
        connection.close();

        long end = System.currentTimeMillis();
        System.out.println(end - start);


    }
}
