package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ExecuteQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection(
                        "jdbc:postgresql://4.194.217.58:5432/t2301e",
                        "t2301e",
                        "t2301e"
                );

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from \"Datcao\"");

        List<Staff> staff = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            Date dob = resultSet.getDate("dob");
            Staff staff1 = new Staff(name,id,dob);
            staff.add(staff1);
        }
        System.out.println(staff);

        statement.close();
        connection.close();
    }
}
