package org.example;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private String documentId;
    private String publishername ;
    private Integer number ;


    public Document(String documentId, String publishername, Integer number) {
        this.documentId = documentId;
        this.publishername = publishername;
        this.number = number;
    }



    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getPublishername() {
        return publishername;
    }

    public void setPublishername(String publishername) {
        this.publishername = publishername;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


}
