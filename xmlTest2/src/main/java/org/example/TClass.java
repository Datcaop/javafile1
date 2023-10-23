package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import lombok.Data;

import java.util.List;

@Data
public class TClass {

    @JsonProperty("student")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Student> students ;



}
