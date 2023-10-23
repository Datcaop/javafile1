package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        School fpt = new School("FPT APTECH", "8 TON THAT THUYET");

        Class aClass = new Class("6A", "6");

        fpt.addClass(aClass);

        Student std1 = new Student("Nguyen Binh", LocalDate.of(2012, 2, 1), "Male");
        std1.getScores().put(Subject.MATHS, 9.3);
        std1.getScores().put(Subject.PHYSICS, 8.1);
        std1.getScores().put(Subject.GEOGRAPHY, 7.4);
        std1.getScores().put(Subject.HISTORY, 8.2);
        std1.getScores().put(Subject.BIOLOGY,6.5 );
        std1.setScores(std1.getScores());

        Student std2 = new Student("Vu Chien",LocalDate.of(2012,6,5),"Male");
        std2.getScores().put(Subject.MATHS,8.3);
        std2.getScores().put(Subject.PHYSICS, 7.1);
        std2.getScores().put(Subject.GEOGRAPHY, 9.4);
        std2.getScores().put(Subject.HISTORY, 9.1);
        std2.getScores().put(Subject.BIOLOGY,9.6 );
        std2.setScores(std2.getScores());


        Student std3 = new Student("Tran Dung",LocalDate.of(2012,3,4),"Female");
        std3.getScores().put(Subject.MATHS,9.8);
        std3.getScores().put(Subject.PHYSICS, 7.2);
        std3.getScores().put(Subject.GEOGRAPHY, 9.1);
        std3.getScores().put(Subject.HISTORY, 7.2);
        std3.getScores().put(Subject.BIOLOGY,7.5 );
        std3.setScores(std3.getScores());


        Student std4 = new Student("Hoang Dat",LocalDate.of(2012,9,2),"Male");
        std4.getScores().put(Subject.MATHS,9.1);
        std4.getScores().put(Subject.PHYSICS, 9.0);
        std4.getScores().put(Subject.GEOGRAPHY, 6.4);
        std4.getScores().put(Subject.HISTORY, 6.8);
        std4.getScores().put(Subject.BIOLOGY,7.9 );
        std4.setScores(std4.getScores());

        Student std5 = new Student("Dang Trang",LocalDate.of(2012,6,5),"Female");
        std5.getScores().put(Subject.MATHS,6.3);
        std5.getScores().put(Subject.PHYSICS, 9.5);
        std5.getScores().put(Subject.GEOGRAPHY, 8.0);
        std5.getScores().put(Subject.HISTORY, 8.2);
        std5.getScores().put(Subject.BIOLOGY,8.3 );
        std5.setScores(std5.getScores());


        aClass.addStudent(std1);
        aClass.addStudent(std2);
        aClass.addStudent(std3);
        aClass.addStudent(std4);
        aClass.addStudent(std5);




    }


}
