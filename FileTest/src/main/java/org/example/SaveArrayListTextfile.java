package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SaveArrayListTextfile {
    public static void main(String[] args) {



    }
    static void saveFile(){
        List<Student> students = new ArrayList<>();

        students.add(new Student("A","Ha Noi"));
        students.add(new Student("B","Ha Nam"));
        students.add(new Student("A","Nam Dinh"));

        FileOutputStream fileOutputStream =null;

        try {
            fileOutputStream = new FileOutputStream("Student.txt");

            for (Student std : students){
                String line = std.formatTextFile() + "\n";
                byte[] b = line.getBytes();

                fileOutputStream.write(b);


            }


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
}
