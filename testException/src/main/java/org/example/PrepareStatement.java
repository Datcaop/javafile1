package org.example;

import java.sql.*;

public class PrepareStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection(
                        "jdbc:postgresql://4.194.217.58:5432/t2301e",
                        "t2301e",
                        "t2301e"
                );

        PreparedStatement statement = connection.prepareStatement(
                "insert into \"Datcao\" (name,dob,job) values (?,?,?)");

        statement.setString(1,"Dat");
        statement.setDate(2,new Date(2021,8,22));
        statement.setString(3,"cde");
        statement.executeUpdate();





        statement.close();
        connection.close();


    }
}
