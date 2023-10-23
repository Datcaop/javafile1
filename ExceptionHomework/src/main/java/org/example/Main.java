package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

//        for (User user : readCsv("users.csv")){
//            System.out.println(user);
//        }

//        insertUser(readCsv("users.csv"));

        for (User user : getUser()){
            System.out.println(user);
        }
    }

    public static User readRow(CSVRecord row){
            String idString = row.get("id");
            String firstName = row.get("first_name");
            String lastName = row.get("last_name");
            String email = row.get("email");
            String gender = row.get("gender");

            int id =Integer.parseInt(idString);

            if (idString == null || firstName == null ||lastName == null ||
        email == null || gender == null){
                throw new RuntimeException("Invalid Data");
            }

            User user = new User(id,firstName,lastName,email,gender);
            return  user;
    }


    public static List<User> readCsv(String filePath){
        List<User> userList = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader(filePath);
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            for (CSVRecord csvRecord : csvParser){
                    User user = readRow(csvRecord);
                    userList.add(user);

            }

            csvParser.close();
            fileReader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }
    public static void insertUser(List<User> users) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection(

                        "jdbc:postgresql://4.194.217.58:5432/t2301e",
                        "t2301e",
                        "t2301e"
                );

        PreparedStatement statement = connection.prepareStatement(
                "insert into datcaovn (id,firstname,lastname,email,gender)"+
                        "values(?,?,?,?,?)");

        connection.setAutoCommit(false);


        for (User user : users){
            statement.setInt(1,user.getId());
            statement.setString(2,user.getFirstName());
            statement.setString(3,user.getLastName());
            statement.setString(4,user.getEmail());
            statement.setString(5,user.getGender());
            statement.addBatch();
        }

        statement.executeBatch();
        connection.commit();

        statement.close();
        connection.close();
    }
    public  static List<User> getUser() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection(

                        "jdbc:postgresql://4.194.217.58:5432/t2301e",
                        "t2301e",
                        "t2301e"
                );

        Statement statement = connection.createStatement();
        List<User> userList = new ArrayList<>();
        ResultSet resultSet = statement.executeQuery(
                "select * from datcaovn "
        );

        while (resultSet.next()){
            Integer id =resultSet.getInt("id");
            String firstName = resultSet.getString("firstname");
            String lastName = resultSet.getString("lastname");
            String email = resultSet.getString("email");
            String gender = resultSet.getString("gender");

            userList.add(new User(id,firstName,lastName,email,gender));

        }

        statement.close();
        connection.close();
        return userList;
    }
}