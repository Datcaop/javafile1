package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            for (User user : readCsv("users.csv")){
                System.out.println(user);
            }

    }

    public static User readRow(CSVRecord row){
        String idString = row.get("id");
        String firstName = row.get("first_name");
        String lastName = row.get("last_name");
        String email = row.get("email");
        String gender = row.get("gender");

        if (idString == null || firstName.isEmpty() || lastName.isEmpty() ||
        email.isEmpty() || gender.isEmpty()){
            throw new RuntimeException("invalid Data");
        }

        User user = new User(idString,firstName,lastName,email,gender);
        return user;
    }

    public static List<User> readCsv(String filePath){
        List<User> users = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(filePath);
            CSVParser csvParser = new CSVParser(fileReader,CSVFormat.DEFAULT.withFirstRecordAsHeader());

            for (CSVRecord record : csvParser){
                try {
                    User user = readRow(record);
                    users.add(user);
                }catch (RuntimeException e){
                    System.out.println(e.getMessage());
                }


            }

            fileReader.close();
            csvParser.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }


}