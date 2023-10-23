package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test.txt");

//            int code = fis.read();
//
//            char c =(char) code;
//            System.out.println("c >>" + c);
            int code ;
            while ((code = fis.read()) != -1){
                    char c = (char) code;
                System.out.print(c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
