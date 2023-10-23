package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("vidu.txt");
        if (file.exists()){
            System.out.println("file exists");
        }else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("File not exists");
        }

        // ghi du lieu vao file

        FileOutputStream fos = null;
        Scanner sc = new Scanner(System.in);

        try {
            fos = new FileOutputStream("test.txt");

//            String line = "Cao Thanh Dat";
//
//            byte[] b = line.getBytes();
//
//            fos.write(b);

            for(;;){
                System.out.println("Insert to the file :");
                String line = sc.nextLine() + "\n";

                byte[] b = line.getBytes();
                fos.write(b);

                System.out.println("Continue ? Y/N");
                String choose = sc.nextLine();
                if (choose.equalsIgnoreCase("N")){
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}