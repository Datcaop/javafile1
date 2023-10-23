package org.example;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private String name ;
    private String grade ;
    private List<Student> students = new ArrayList<>();

    public Class(String name, String grade, List<Student> students) {
        this.name = name;
        this.grade = grade;
        this.students = students;
    }

    public Class(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }
}
