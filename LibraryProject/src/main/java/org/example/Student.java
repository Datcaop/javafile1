package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name ;
    private LocalDate dob;
    private String gender ;
    private Map<Subject,Double> scores = new HashMap<>();

    public Student(String name, LocalDate dob, String gender, Map<Subject, Double> scores) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.scores = scores;
    }

    public Student(String name, LocalDate dob, String gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Map<Subject, Double> getScores() {
        return scores;
    }

    public void setScores(Map<Subject, Double> scores) {
        this.scores = scores;
    }
}
