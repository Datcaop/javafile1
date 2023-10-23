package org.example;

import netscape.javascript.JSObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws JSONException {
        List<Data> dataList = new ArrayList<>();

        String json =
                """
                        {"students":[{"id":null,"name":"null","dob":"1990-01-01"},{"id":2,"name":"Son","dob":"2001-01-01"},{"id":3,"name":"An","dob":"2002-01-01"},{"id":4,"name":"Binh","dob":"2001-01-01"},{"id":5,"name":"Dat","dob":"2004-01-01"},{"id":6,"name":"Huy","dob":"2006-01-01"},{"id":7,"name":"Dao","dob":"2010-01-01"}]}
                        """;

        JSONObject jsonObject = new JSONObject(json);

        JSONArray studentsJson = jsonObject.getJSONArray("students");
        for (int i = 0; i < studentsJson.length(); i++) {
            JSONObject studentJson = studentsJson.getJSONObject(i);
           Integer id;
            if (studentJson.isNull("id")){
                id = -1;
            }else
            id = studentJson.getInt("id");

            String name;
            if (studentJson.isNull("name")){
                name = null;
            }else {
                name = studentJson.getString("name");}

            String dobString;
            if (studentJson.isNull("dob")){
                dobString = null;
            }else {

                dobString = studentJson.getString("dob");
            }

            Data data = new Data(id,name,dobString);

            dataList.add(data);
        }

        for (Data data : dataList){
            System.out.println(data);
        }
    }







}