package org.example;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        for (User user :readCsv("users.csv")){
            System.out.println(user.toString());
        }

    }

    public static User readrow(CSVRecord row){
            String idString = row.get("id");
            String firstName = row.get("first_name");
            String lastName = row.get("last_name");
            String email = row.get("email");
            String gender = row.get("gender");

            User user = new User(idString,firstName,lastName,email,gender);
            return user;
    }

    public static List<User> readCsv(String filePath){
        try {
            FileReader fileReader = new FileReader(filePath);
            CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT.withFirstRecordAsHeader());

            List<User> userList = new ArrayList<>();

            for (CSVRecord csvRecord : csvParser){
                    User user = readrow(csvRecord);
                    userList.add(user);
            }


            csvParser.close();
            fileReader.close();
            return userList;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}