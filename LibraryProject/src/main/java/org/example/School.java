package org.example;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name ;
    private String address;
    List<Class> classes = new ArrayList<>();

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public School(String name, String address, List<Class> classes) {
        this.name = name;
        this.address = address;
        this.classes = classes;
    }

    public void addClass(Class classs){
        classes.add(classs);
    }

}
