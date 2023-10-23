package org.example;


import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class Data {
    private String firstName  ;
    private String lastName ;
    private Integer age;
    private LocalDate dob ;
    private Gender gender;

    public Data(String name, Integer age, LocalDate dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public Data() {
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                '}';
    }

    public Long getAge(){
        return chronoUnit.
    }
}
