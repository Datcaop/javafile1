package org.example;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainJackson {
    public static void main(String[] args) throws IOException {
        File file = new File("Class.xml");
        XmlMapper mapper = new XmlMapper();
        TClass tClass = mapper.readValue(file, TClass.class);
        System.out.println(tClass);
    }
}
