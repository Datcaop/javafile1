package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Data data = new Data();
        data.setName("Nam");
        data.setDob(LocalDate.of(2000,12,31));
        data.setGender(Gender.MALE);

        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule



    }
}