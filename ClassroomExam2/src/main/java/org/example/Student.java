package org.example;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    private Integer id;
    private String name;

    @JsonProperty("dob")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "d MMMM yyyy hh:mm:ss a")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime dateOfBirth;

    private Gender gender;

    public Student(Integer id, String name, LocalDateTime dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = null;
            return;
        }
        if (name.contains("@")) {
            throw new RuntimeException("Name is not valid");
        }
        this.name = name.toLowerCase();
    }

//    public void setDateOfBirth(String dateOfBirth) {
//        if (dateOfBirth == null) {
//            this.dateOfBirth = null;
//            return;
//        }
//        this.dateOfBirth = LocalDateTime.parse(dateOfBirth, DateTimeFormatter.ofPattern("d MMMM yyyy hh:mm:ss a"));
//    }
}
