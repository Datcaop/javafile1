package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        for (User user : readCsv("User.csv")){
//            System.out.println(user);
//        }

//        insertUser(readCsv("User.csv"));
        System.out.println("Size of CSSfile :" + readCsv("User.csv").size());
    }

    private static User readRow(CSVRecord record){
        String idString = record.get("Id");
        String firstName = record.get("First name");
        String lastName = record.get("Last name");
        String email = record.get("Email");
        String gender = record.get("Gender");
        String phone = record.get("Phone");
        String dob = record.get("Date of birth");
        String jobTiltle = record.get("Job title");


        int id = Integer.parseInt(idString);

        if(idString.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty()
                || gender.isEmpty() || phone.isEmpty() || dob.isEmpty() || jobTiltle.isEmpty()){
            throw  new RuntimeException(" Data is missed information");
        }

        User user = new User(id,firstName,lastName,email,gender,phone,dob,jobTiltle);
        return user;

    }

    private static List<User> readCsv(String filePath){
        List<User> userList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            for ( CSVRecord csvRecord : csvParser){
                try {
                    User user = readRow(csvRecord);
                    userList.add(user);
                }catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return userList;
    }

    private static  void  insertUser(List<User> users) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");

        Connection connection = DriverManager
                .getConnection(

                        "jdbc:postgresql://4.194.217.58:5432/t2301e",
                        "t2301e",
                        "t2301e"
                );

        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into users_dattc (id ,first_name , last_name , email,gender, phone ,date_of_birth,job_title)" +
                        "values(?,?,?,?,?,?,?,?)"
        );
        connection.setAutoCommit(false);

        for (User user :users){
            preparedStatement.setInt(1,user.getId());
            preparedStatement.setString(2,user.getFirstName());
            preparedStatement.setString(3,user.getLastName());
            preparedStatement.setString(4,user.getEmail());
            preparedStatement.setString(5,user.getGender());
            preparedStatement.setString(6,user.getPhone());
            preparedStatement.setString(7,user.getDob());
            preparedStatement.setString(8,user.getJobTitle());

            preparedStatement.addBatch();

        }

        preparedStatement.executeBatch();
        connection.commit();


        preparedStatement.close();
        connection.close();

    }


}