package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveArrrayListByteFile {
    public static void main(String[] args) {
//            saveFile();
        readFile();
    }
    static void saveFile(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("A","Ha Noi"));
        students.add(new Student("B","Ha Nam"));
        students.add(new Student("A","Nam Dinh"));

        FileOutputStream fileOutputStream =null;
        ObjectOutputStream oos = null;

        try {
            fileOutputStream = new FileOutputStream("Student.dat");
            oos = new ObjectOutputStream(fileOutputStream);

            oos.writeObject(students);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static void readFile(){
        FileInputStream fileInputStream = null;
        ObjectInputStream ois = null;

        try {
            fileInputStream = new FileInputStream("Student.dat");
            ois = new ObjectInputStream(fileInputStream);

            List<Student> students = (List<Student>) ois.readObject();
            for (Student student : students){
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
