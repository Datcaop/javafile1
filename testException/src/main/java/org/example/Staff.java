package org.example;

import java.util.Date;

public class Staff {
    private String name ;
    private Integer id;
    private Date dob;

    public Staff(String name, Integer id, Date dob) {
        this.name = name;
        this.id = id;
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", dob=" + dob +
                '}';
    }
}
