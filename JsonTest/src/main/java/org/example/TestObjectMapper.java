package org.example;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class TestObjectMapper {
    public static void main(String[] args) throws IOException {
        String json =
                """
                        {"students":[{"id":1,"name":"Tho","dob":"1990-01-01"},{"id":2,"name":"Son","dob":"2001-01-01"},{"id":3,"name":"An","dob":"2002-01-01"},{"id":4,"name":"Binh","dob":"2001-01-01"},{"id":5,"name":"Dat","dob":"2004-01-01"},{"id":6,"name":"Huy","dob":"2006-01-01"},{"id":7,"name":"Dao","dob":"2010-01-01"}]}
                        """;

        ObjectMapper objectMapper = new ObjectMapper();
        Datas datas = objectMapper.readValue(json, Datas.class);
        System.out.println(datas);

    }
}
