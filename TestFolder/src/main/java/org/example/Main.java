package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("test.txt");
        if(file.exists()){
            System.out.println("File");
        }else {
            System.out.println("Not found");
        }
    }
}