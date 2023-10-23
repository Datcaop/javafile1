package org.example;

public class Book extends Document {
    private String authorName ;
    private Integer pageNumber;

    public Book(String documentId, String publishername, Integer number, String authorName, Integer pageNumber) {
        super(documentId, publishername, number);
        this.authorName = authorName;
        this.pageNumber = pageNumber;
    }
}
